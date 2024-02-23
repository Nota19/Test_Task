package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.ElectroType;

import ru.hmel.service.ElectroTypeLocalServiceUtil;

/**
 * @author Hmel Max
 * @generated
 */
public abstract class ElectroTypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ElectroTypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ElectroTypeLocalServiceUtil.getService());
        setClass(ElectroType.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("electro_type_id");
    }
}
