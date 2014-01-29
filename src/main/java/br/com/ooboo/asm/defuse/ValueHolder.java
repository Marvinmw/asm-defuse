package br.com.ooboo.asm.defuse;

import java.util.Set;

import org.objectweb.asm.Type;

public class ValueHolder extends Value {

	public final Value value;

	public final String name;

	public ValueHolder(final Type type, final Value value, final String name) {
		super(type);
		this.value = value;
		this.name = name;
	}

	@Override
	public Set<Variable> getVariables() {
		return value.getVariables();
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", name, value);
	}

}
