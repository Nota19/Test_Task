package ru.hmel.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.PositionType;

import ru.hmel.service.PositionTypeLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PositionTypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PositionTypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PositionTypeLocalServiceUtil.getService());
        setClass(PositionType.class);

        setClassLoader(ru.hmel.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("position_id");
    }
}
