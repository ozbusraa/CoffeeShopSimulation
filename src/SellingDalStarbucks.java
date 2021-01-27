
public class SellingDalStarbucks implements SellingDal {

	int remainingCoffee;

	@Override
	public int getStockCount() {
		System.out.println("DB: Starbucks stokta bulunan kahve sayýsý: " + remainingCoffee);
		return remainingCoffee;
	}

	@Override
	public void updateStock(int coffeeCount) {
		this.remainingCoffee -= coffeeCount;
		System.out.println(
				"DB: Starbucks stoklarýndan " + coffeeCount + " kahve eksildi. Kalan kahve sayýsý: " + remainingCoffee);

	}

	@Override
	public void createStock(int coffeeCount) {
		this.remainingCoffee = coffeeCount;
		System.out.println("DB: Starbucks stoðu " + coffeeCount + " adet kahve olarak güncellenmiþtir.");

	}
}
