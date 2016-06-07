package com.javaweb.po;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import java.util.EnumSet;

/**
 * Created by 张宝宁 on 2016/6/7.
 */
public class CreatDB {
    public static void main(String[] args) {
        ServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(sr).buildMetadata();
        SchemaExport se = new SchemaExport();
        se.create(EnumSet.of(TargetType.DATABASE),metadata);
    }
}
