package de.hybris.personalizationtrail.trigger.dao;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.personalizationservices.model.CxVariationModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;
import java.util.Collection;
import java.util.Set;
public interface UserGroupTriggerDao extends Dao
{
    Collection<CxVariationModel> findApplicableVariations(Set<UserGroupModel> userGroups, CatalogVersionModel catalogVersion);
}