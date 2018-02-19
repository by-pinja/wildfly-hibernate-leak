package com.protacon.test.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TestEmbeddedKey implements Serializable {

	private static final long serialVersionUID = 1L;
	private long firstId;
	private long secondId;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TestEmbeddedKey)) return false;

		TestEmbeddedKey that = (TestEmbeddedKey) o;

		if (firstId != that.firstId) return false;
		return secondId == that.secondId;
	}

	@Override
	public int hashCode() {
		int result = (int) (firstId ^ (firstId >>> 32));
		result = 31 * result + (int) (secondId ^ (secondId >>> 32));
		return result;
	}
}
