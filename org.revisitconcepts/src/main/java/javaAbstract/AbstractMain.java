package javaAbstract;

abstract class AbstractAdmin {

	public abstract void vision();

	public abstract void premisesAccess();

	public void rulebook() {
		System.out.println(
				"contains the rules and regulation that must be followed by the teahers, parents and students ");
	}

}

class AbstractTeacher extends AbstractAdmin {
	@Override
	public void vision() {
		// TODO Auto-generated method stub

		System.out.println("engage, inspire and empower student to reach their potential");

	}

	@Override
	public void premisesAccess() {
		// TODO Auto-generated method stub

		System.out.println("staff room and class room not the admin room (principal room)");

	}

	public void rulebook() {
		System.out.println(
				"contains the rules and regulation that must be followed by the teahers, parents and students ");
	}
}

class AbstractParent extends AbstractAdmin {

	@Override
	public void vision() {
		// TODO Auto-generated method stub

		System.out.println(
				"parent resposibility is to make decisions concerning and affecting the care, welfare and proper development of the child in education");

	}

	@Override
	public void premisesAccess() {
		// TODO Auto-generated method stub
		System.out.println("premises access to contact staff only if permission granted by the authority");

	}

	public void rulebook() {
		System.out.println(
				"contains the rules and regulation that must be followed by the teahers, parents and students ");
	}

}

class AbstractStudent extends AbstractAdmin {

	@Override
	public void vision() {
		// TODO Auto-generated method stub

		System.out.println("maintain proper disicipline and study well");

	}

	@Override
	public void premisesAccess() {
		// TODO Auto-generated method stub
		System.out.println("only class room");

	}

	public void rulebook() {
		System.out.println(
				"contains the rules and regulation that must be followed by the teahers, parents and students ");
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractAdmin absobj = new AbstractTeacher();
		absobj.vision();
		absobj.premisesAccess();
		absobj.rulebook();
		System.out.println("   ");
		
		AbstractAdmin absobj1 = new AbstractParent();
		absobj1.vision();
		absobj1.premisesAccess();
		absobj1.rulebook();
		System.out.println("   ");
		
		AbstractAdmin absobj2 = new AbstractStudent();
		absobj2.vision();
		absobj2.premisesAccess();
		absobj2.rulebook();
		

	}

}
