
public class SellingDalNero implements SellingDal {

	int remainingCoffee;

	@Override
	public int getStockCount() {
		System.out.println("DB: Nero stokta bulunan kahve sayýsý: " + remainingCoffee);
		return remainingCoffee;
	}

	@Override
	public void updateStock(int coffeeCount) {
		this.remainingCoffee -= coffeeCount;
		System.out.println(
				"DB: Nero stoklarýndan " + coffeeCount + " kahve eksildi. Kalan kahve sayýsý: " + remainingCoffee);

	}

	@Override
	public void createStock(int coffeeCount) {
		this.remainingCoffee = coffeeCount;
		System.out.println("DB: Nero stoðu " + coffeeCount + " adet kahve olarak güncellenmiþtir.");
	}

}
