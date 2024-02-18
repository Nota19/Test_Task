package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.Purchase;

import ru.hmel.service.PurchaseLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PurchaseActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PurchaseActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PurchaseLocalServiceUtil.getService());
        setClass(Purchase.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("purchase_id");
    }
}
