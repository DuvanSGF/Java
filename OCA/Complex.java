package herencia;

public class Complex {
	private final double real;
	private final double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

//Adding complex numbers
	public Complex plus(Complex b) {
		double newReal = real + b.real;
		double newImaginary = imaginary + b.imaginary;
		return new Complex(newReal, newImaginary);
	}

//Substracting complex numbers
	public Complex minus(Complex otherComplex) {
		double newReal = real - otherComplex.real;
		double newImaginary = imaginary - otherComplex.imaginary;
		return new Complex(newReal, newImaginary);
	}

	public Complex times(Complex b) {
		double newReal = real * b.real - imaginary * b.imaginary;
		double newImaginary = real * b.imaginary + imaginary * b.real;
		return new Complex(newReal, newImaginary);
	}
	// Dividing
	
	public Complex times1(Complex b) {
		double newReal = real * b.real - imaginary *
		b.imaginary;
		double newImaginary = real * b.imaginary +
		imaginary * b.real;
		return new Complex(newReal, newImaginary);
		}
	
}