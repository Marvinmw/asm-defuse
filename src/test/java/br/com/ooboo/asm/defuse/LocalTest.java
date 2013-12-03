package br.com.ooboo.asm.defuse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocalTest {

	private Local local;

	@Before
	public void setUp() {
		local = new Local(null, 1);
	}

	@Test
	public void AttributesAreCorrect() {
		Assert.assertEquals(1, local.var);
	}

	@Test
	public void EqualsASelfReturnTrue() {
		Assert.assertTrue(local.equals(local));
	}

	@Test
	public void EqualsANullReturnsFalse() {
		Assert.assertFalse(local.equals(null));
	}

	@Test
	public void EqualsButDifferentClassReturnsFalse() {
		final Local other = new Local(null, 1) {
			/* other class */
		};
		Assert.assertFalse(local.equals(other));
	}

	@Test
	public void EqualsButDifferentVarReturnFalse() {
		final Local other = new Local(null, 2);
		Assert.assertFalse(local.equals(other));
	}

	@Test
	public void EqualsReturnTrue() {
		final Local other = new Local(null, 1);
		Assert.assertTrue(local.equals(other));
	}

	@Test
	public void EqualsButDifferentVarReturnOtherHash() {
		final Local other = new Local(null, 2);
		Assert.assertNotEquals(local.hashCode(), other.hashCode());
	}

	@Test
	public void EqualsReturnSameHash() {
		final Local other = new Local(null, 1);
		Assert.assertEquals(local.hashCode(), other.hashCode());
	}

	@Test
	public void LocalToString() {
		Assert.assertEquals("L@1", local.toString());
	}

}
