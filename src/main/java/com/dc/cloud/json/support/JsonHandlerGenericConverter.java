package com.dc.cloud.json.support;

import org.springframework.core.annotation.Order;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

//转换类 已解决废弃类
@Deprecated
@Order(Integer.MIN_VALUE)
public class JsonHandlerGenericConverter implements GenericConverter {

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class,URI.class ));
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        return source;
    }
}
