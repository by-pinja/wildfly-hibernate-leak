package com.protacon.test.model;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@RevisionEntity
@Table(name = "custom_revision_info", schema = "test_schema")
public class CustomRevisionInfo {
    @Id
    @RevisionNumber
    @Column(name = "rev_number")
    private long revNumber;

    @RevisionTimestamp
    @Column(name = "timestamp")
    private Date timestamp;
}
