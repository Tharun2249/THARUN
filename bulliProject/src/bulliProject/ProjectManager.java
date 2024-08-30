package bulliProject;

public class ProjectManager extends Employee {

	double psal;
	public ProjectManager() {
		super();
	}

	public ProjectManager(int id,double wages,int years)
	{
		super(id,wages,years);
		super.title="Project Manager";
		super.catgeory='P';

	}
	
	@Override
	public double calSal(Employee e) {
		// TODO Auto-generated method stub
		psal = e.years*10000;
		return psal;
	}
	
	public double mediclaim()
	{
		return 0.0;
		
	}

	@Override
	public double mediClaim() {
		// TODO Auto-generated method stub
		
		return psal;
	}
}
