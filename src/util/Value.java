package util;

public class Value {
	private int Value;
	
	public Value(int value) {
		this.Value = value;
	}

	@Override
	public String toString() {
		return "Value [Value=" + Value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (Value != other.Value)
			return false;
		return true;
	}
	
}
