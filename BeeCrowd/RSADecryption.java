import java.math.BigInteger;

public class RSADecryption {

    public static void main(String[] args) {
        // Given values
        BigInteger e = new BigInteger("15537");
        BigInteger c = new BigInteger("4744275480125761149475439652189568532719997985297643024045625900665305682630452044004013647350658428069718952801828651333880186841289630294789054322237585");
        BigInteger p = new BigInteger("29");
        BigInteger q = new BigInteger("81950208731605030173072901497240676460946134422613059941413476068465656250011");

        // Calculate n and phi(n)
        BigInteger n = p.multiply(q);
        BigInteger phi_n = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        // Compute the modular inverse of e (this is d)
        BigInteger d = e.modInverse(phi_n);

        // Decrypt the ciphertext using m = c^d mod n
        BigInteger m = c.modPow(d, n);

        // Print the decrypted message (it may be encoded in bytes or a number)
        System.out.println("Decrypted message: " + m.toString());
    }
}
