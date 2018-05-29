import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		String[] months = { "janvāris", // 31
				"februāris", // 28 or 29
				"marts", // 31
				"aprīlis", // 30
				"maijs", // 31
				"jūnijs", // 30
				"jūlijs", // 31
				"augusts", // 31
				"septembris", // 30
				"oktobris", // 31
				"novembris", // 30
				"decembris" // 31
		};

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet datumu: ");
		int date = sc.nextInt();

		System.out.print("Ievadiet mēnesi: ");
		int month = sc.nextInt();

		System.out.print("Ievadiet gadu: ");
		int year = sc.nextInt();
		sc.close();

		if (month < 1 || month > 12) {
			System.out.println("nepareizi ievadīts mēnesis (1-12)");
		} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& (date < 1 || date > 31)) {
			System.out.println("mēnesī '" + months[month - 1] + "' nav " + date + ". datuma");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && (date < 1 || date > 30)) {
			System.out.println("mēnesī '" + months[month - 1] + "' nav " + date + ". datuma");
		} else if (month == 2 && year % 4 == 0 && (date < 1 || date > 29)
				|| (month == 2 && year % 4 != 0 && (date < 1 || date > 28))) {
			System.out.println("mēnesī '" + months[month - 1] + "' nav " + date + ". datuma");
		} else {
			System.out.println("" + date + ". " + months[month - 1]);
		}

	}
}
