package Deom1;

import org.junit.jupiter.api.Test;

public class DeomTest {

	@Test
	public void getAge1() {
		String age = DateUtil.getAge("2019-12-11");
		System.out.println(age);
	}

	@Test
	public void getDateByMonthInit1() {
		String i = DateUtil.getDateByMonthInit("2019-12-01");
		System.out.println(i);
	}

	@Test
	public void getDateByMonthLast1() {
		String string = DateUtil.getDateByMonthLast("2019-12-01 00:00:00");
		System.out.println(string);
	}

	@Test
	public void getDateByFuture1() {
		int i = DateUtil.getDateByFuture(12);
		System.out.println(i);
	}

	@Test
	public void getDateByDeparted1() {
		int i = DateUtil.getDateByDeparted(55);
		System.out.println(i);
	}

}
