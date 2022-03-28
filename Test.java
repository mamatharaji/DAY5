package InterfaceTest2;

public class Test
{
	public static void main(String[] args)
	{
		
	 GoingToSchool gs = null;
	 gs.learnMusic();
	 gs.listenToTheClass();
	 System.out.println("................................");
	 GoingTORestaurant gr = null;
	 gr.eatFood();
	 gr.giveFeedBack();
	 
		
	}

}
interface GoingToSchool
{
	void learnGuitar();
	void learnMusic();
	void read();
	void listenToTheClass();
	
}
interface GoingTORestaurant
{
	void orderFood();
	void eatFood();
	void giveFeedBack();
}


class TwoWheeler implements GoingToSchool, GoingTORestaurant
{
	

	public void orderFood()
	{
		
		
	}

	@Override
	public void eatFood() {
		System.out.println("Eating delicious food");
		
	}

	@Override
	public void giveFeedBack() {
		// TODO Auto-generated method stub
		System.out.println("Writting feedback.......");
		
	}

	@Override
	public void learnGuitar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void learnMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("reading chapter number 4.....");
		
	}

	@Override
	public void listenToTheClass() {
		// TODO Auto-generated method stub
		System.out.println("listening to the mathematics class......");
		
	}
	
}