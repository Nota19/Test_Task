package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.Electronics;

import ru.hmel.service.ElectronicsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ElectronicsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ElectronicsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ElectronicsLocalServiceUtil.getService());
        setClass(Electronics.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("electronics_id");
    }
}
