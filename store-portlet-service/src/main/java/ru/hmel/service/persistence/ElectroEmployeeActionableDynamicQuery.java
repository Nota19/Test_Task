package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.ElectroEmployee;

import ru.hmel.service.ElectroEmployeeLocalServiceUtil;

/**
 * @author Hmel Max
 * @generated
 */
public abstract class ElectroEmployeeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ElectroEmployeeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ElectroEmployeeLocalServiceUtil.getService());
        setClass(ElectroEmployee.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.electro_employee_id");
    }
}
