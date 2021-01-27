
public class SellingDalStarbucks implements SellingDal {

	int remainingCoffee;

	@Override
	public int getStockCount() {
		System.out.println("DB: Starbucks stokta bulunan kahve say�s�: " + remainingCoffee);
		return remainingCoffee;
	}

	@Override
	public void updateStock(int coffeeCount) {
		this.remainingCoffee -= coffeeCount;
		System.out.println(
				"DB: Starbucks stoklar�ndan " + coffeeCount + " kahve eksildi. Kalan kahve say�s�: " + remainingCoffee);

	}

	@Override
	public void createStock(int coffeeCount) {
		this.remainingCoffee = coffeeCount;
		System.out.println("DB: Starbucks sto�u " + coffeeCount + " adet kahve olarak g�ncellenmi�tir.");

	}
}
