package com.channeladvisor.models;

import com.channeladvisor.model.LtbChannelAdvisorFortiusFieldMapModel;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductCsvColumn {
    private String column;
    private String id;
    private List<String> values;
    private Integer priority;
    private Boolean isFortius;
    private String galleryImage;
    private Boolean referable;

    public ProductCsvColumn(LtbChannelAdvisorFortiusFieldMapModel model) {
        this.column = model.getAdvisorName();
        this.isFortius = StringUtils.isNotBlank(model.getFortiusGuid());
        this.id = isFortius ?  model.getFortiusGuid() : model.getPropertyName();
        this.priority = model.getPriority();
        this.values = new ArrayList<>();
        this.galleryImage = model.getGalleryImages();
        this.referable = model.getReferable();
    }

    public String getColumn() {
        return column;
    }

    public List<String> getValues() {
        return values;
    }

    public void add(String value) {
        values.add(value);
    }

    public void clear() {
        values.clear();
    }

    public String getId() {
        return id;
    }

    public Integer getPriority() {
        return priority;
    }

    public Boolean getFortius() {
        return isFortius;
    }

    public String getGalleryImage() {
        return galleryImage;
    }

    public Boolean getReferable() {
        return referable;
    }

    public void setReferable(Boolean referable) {
        this.referable = referable;
    }
}
