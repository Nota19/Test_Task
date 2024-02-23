package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.PurchaseType;

import ru.hmel.service.PurchaseTypeLocalServiceUtil;

/**
 * @author Hmel Max
 * @generated
 */
public abstract class PurchaseTypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PurchaseTypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PurchaseTypeLocalServiceUtil.getService());
        setClass(PurchaseType.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("purchase_type_id");
    }
}
