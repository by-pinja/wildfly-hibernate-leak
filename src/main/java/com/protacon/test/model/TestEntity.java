package com.protacon.test.model;


import javax.persistence.*;

@Entity
@Table(name = "test_entity", schema = "test_schema")
public class TestEntity {

	@EmbeddedId
	private TestEmbeddedKey key = new TestEmbeddedKey();
}
