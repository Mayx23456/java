package BlockChain;

import java.util.Date;

public class Block {

	public String hash; // digital Signature
	public String previousHash;
	private String data; // data storing
	private long timeStamp; // as number of milliseconds
	private int nonce;

	public Block(String data, String previousHash)// Block constructor
	{
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}
	// applySha256 helper

	public String calculateHash() {
		String calculatedhash =
				// Concatenate the previous hash, current time stamp,
				// and the data to create a unique input
				StringUtil.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + data);
		return calculatedhash;
	}

	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0');
		while (!hash.substring(0, difficulty).equals(target)) {
			nonce++;
			hash = calculateHash();
		}
		System.out.println("Block Mined !!" + hash);
		// The mineBlock() method takes in an int called difficulty,
		// this is the number of 0’s they must solve for.
	}
}
