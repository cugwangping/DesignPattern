package cipher;

public class CipherDecorator implements Cipher {
	
	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher){
		this.cipher = cipher;
	}
	
	@Override
	public String encrypt(String plainText) {
		// TODO Auto-generated method stub
		return cipher.encrypt(plainText);
	}

}
