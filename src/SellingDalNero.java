
public class SellingDalNero implements SellingDal {

	int remainingCoffee;

	@Override
	public int getStockCount() {
		System.out.println("DB: Nero stokta bulunan kahve say�s�: " + remainingCoffee);
		return remainingCoffee;
	}

	@Override
	public void updateStock(int coffeeCount) {
		this.remainingCoffee -= coffeeCount;
		System.out.println(
				"DB: Nero stoklar�ndan " + coffeeCount + " kahve eksildi. Kalan kahve say�s�: " + remainingCoffee);

	}

	@Override
	public void createStock(int coffeeCount) {
		this.remainingCoffee = coffeeCount;
		System.out.println("DB: Nero sto�u " + coffeeCount + " adet kahve olarak g�ncellenmi�tir.");
	}

}
