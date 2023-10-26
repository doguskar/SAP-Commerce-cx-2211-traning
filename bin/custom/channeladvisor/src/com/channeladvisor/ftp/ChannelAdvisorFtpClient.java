package com.channeladvisor.ftp;

import com.channeladvisor.model.ChannelAdvisorSendProductsJobModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ChannelAdvisorFtpClient {

    private List<File> failedFiles;
    private String ftpUrl;
    private String ftpUserName;
    private String ftpPassword;
    private String ftpDir;

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelAdvisorFtpClient.class);

    public void uploadCsvToChannelAdvisorFTP(List<File> files, ChannelAdvisorSendProductsJobModel jobModel) throws Exception {
        FTPClient ftp = new FTPClient();
        failedFiles = new ArrayList<>();
        setFtpCredentials(jobModel);
        try{
            int reply;
            ftp.connect(ftpUrl);
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply))
            {
                ftp.disconnect();
                throw new Exception("Exception in connecting to FTP Server");
            }
            if(!ftp.login(ftpUserName, ftpPassword)){
                throw new Exception("FTP login error");
            }
            LOGGER.info("FTP login is success");

            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            ftp.setConnectTimeout(30000);

            ftp.setSoTimeout(30000);
            ftp.setControlKeepAliveTimeout(1); //Send An Keep Alive Message every second
            ftp.setControlKeepAliveReplyTimeout(30000); //Wait atleast 5 seconds to respond to my KeepAlive messages

            LOGGER.info("FTP target URL: {}", ftpDir);
            LOGGER.info("Start sending files. File count: {}", files.size());

            for (File file:files) {
                boolean result = sendFile(file, ftp, ftpDir);
                if (!result){
                    failedFiles.add(file);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            try {
                ftp.logout();
                ftp.disconnect();
                LOGGER.info("FTP connection is closed");
            } catch (IOException f) {
                LOGGER.error("FTP logout exception", f);
            }
        }
    }

    private boolean sendFile(File file, FTPClient ftp, String ftpDir) {
        try(InputStream in = new FileInputStream(file)){
            LOGGER.info("Sending file {}", file.getName());
            boolean ftpResponse = ftp.storeFile(ftpDir + "/" + file.getName(), in);
            if (ftpResponse){
                LOGGER.info("{} File is sent to FTP", file.getName());
                deleteFile(file);
                return true;
            }else{
                LOGGER.error("FTP File sending error. File: {}", file.getName());
                return false;
            }
        }catch (Exception e){
            LOGGER.error("FTP File send error. File path: {}", file.getPath(), e);
            return false;
        }
    }

    public List<File> getFailedFiles() {
        return failedFiles;
    }

    private void deleteFile(File file){
        try {
            Files.delete(Paths.get(file.getPath()));
        }catch (Exception e){
            LOGGER.error("Local CSV File delete error", e);
        }
    }

    private void setFtpCredentials(ChannelAdvisorSendProductsJobModel jobModel){
        if (StringUtils.isEmpty(ftpUrl) || StringUtils.isEmpty(ftpUserName) || StringUtils.isEmpty(ftpPassword) || StringUtils.isEmpty(ftpDir)){
            ftpUrl = jobModel.getFtpUrl();
            ftpDir = jobModel.getFtpDir();
            if (ftpDir.length() > 1 && ftpDir.charAt(ftpDir.length() - 1) == '/'){
                ftpDir = ftpDir.substring(0, ftpDir.length() - 1);
            }
            ftpUserName = jobModel.getFtpUserName();
            ftpPassword = jobModel.getFtpPassword();
        }
    }
}
