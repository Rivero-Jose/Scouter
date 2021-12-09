import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class Scout {

	Random gene = new Random();

	public String in(String s) {
		return JOptionPane.showInputDialog(s);
	}

	public void msg(String s) {
		JOptionPane.showMessageDialog(null, s);

	}

	private Pictures P;
	public Scout() {
		P = new Pictures();
	}

	
	double gemspent = 0;
	double AQgemspent = 0;
	double Mgemspent = 0;

	double Rares = 0;
	double SuperRares = 0;
	double SuperSuperRares = 0;
	double UltraRares = 0;

	double MRares = 0;
	double MSuperRares = 0;
	double MSuperSuperRares = 0;
	double MUltraRares = 0;

	double AQRares = 0;
	double AQSuperRares = 0;
	double AQSuperSuperRares = 0;
	double AQUltraRares = 0;

	public void Mscout() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MUR.length);
					DATA[i] = P.MUR[x];
					k++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSR.length);
					DATA[i] = P.MSSR[x];
					k++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MeventSR.length);
						DATA[i] = P.MeventSR[x];
						k++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSR.length);
						DATA[i] = P.MSR[x];
						k++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MUR.length);
					DATA[i] = P.MUR[x];
					k++;
					MUltraRares++;
					UltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSR.length);
					DATA[i] = P.MSSR[x];
					k++;
					MSuperSuperRares++;
					SuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MeventSR.length);
						DATA[i] = P.MeventSR[x];
						k++;
						MSuperRares++;
						SuperRares++;
					} else {
						int x = gene.nextInt(P.MSR.length);
						DATA[i] = P.MSR[x];
						k++;
						MSuperRares++;
						SuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MR.length);
					DATA[i] = P.MR[y];
					MRares++;
					Rares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Muse 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			Mscout();
		}
		if (x == 1) {
			Mscout();
		}
		if (x == 2) {
			Mscout();
		}
		if (x == 3) {
			Mscout();
		}
		if (x == 4) {
			Mscout();
		}
		if (x == 5) {
			Mscout();
		}
		if (x == 6) {
			Mscout();
		}
		if (x == 7) {
			Mscout();
		}
		if (x == 8) {
			Mscout();
		}
		if (x == 9) {
			Mscout();
		}
		if (x == 10) {
			Mscout();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void AQscout() {
		ImageIcon[] DATA = { AQOURS, AQOURS, AQOURS, AQOURS, AQOURS, AQOURS,
				AQOURS, AQOURS, AQOURS, AQOURS, AQOURS, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.AqUR.length);
					DATA[i] = P.AqUR[x];
					k++;
					UltraRares++;
					AQUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.AqSSR.length);
					DATA[i] = P.AqSSR[x];
					k++;
					SuperSuperRares++;
					AQSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.AqeventSR.length);
						DATA[i] = P.AqeventSR[x];
						k++;
						SuperRares++;
						AQSuperRares++;
					} else {
						int x = gene.nextInt(P.AqSR.length);
						DATA[i] = P.AqSR[x];
						k++;
						SuperRares++;
						AQSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.AqUR.length);
					DATA[i] = P.AqUR[x];
					k++;
					UltraRares++;
					AQUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.AqSSR.length);
					DATA[i] = P.AqSSR[x];
					k++;
					SuperSuperRares++;
					AQSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.AqeventSR.length);
						DATA[i] = P.AqeventSR[x];
						k++;
						SuperRares++;
						AQSuperRares++;
					} else {
						int x = gene.nextInt(P.AqSR.length);
						DATA[i] = P.AqSR[x];
						k++;
						SuperRares++;
						AQSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.AqR.length);
					DATA[i] = P.AqR[y];
					Rares++;
					AQRares++;
				}
			}
		}
		gemspent += 50;
		AQgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Aquors 10 + 1 scouts \n"
				+ "Total Gems spent " + gemspent + "\n Aquors gems spent "
				+ AQgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Aquors cards: URs" + AQUltraRares
				+ " SSRs " + AQSuperSuperRares + " SRs " + AQSuperRares
				+ " Rs " + AQRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			AQscout();
		}
		if (x == 1) {
			AQscout();
		}
		if (x == 2) {
			AQscout();
		}
		if (x == 3) {
			AQscout();
		}
		if (x == 4) {
			AQscout();
		}
		if (x == 5) {
			AQscout();
		}
		if (x == 6) {
			AQscout();
		}
		if (x == 7) {
			AQscout();
		}
		if (x == 8) {
			AQscout();
		}
		if (x == 9) {
			AQscout();
		}
		if (x == 10) {
			AQscout();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				AQgemspent = 0;
				UltraRares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				Rares = 0;
				AQUltraRares = 0;
				AQSuperSuperRares = 0;
				AQSuperRares = 0;
				AQRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	double BT = 0;

	public void BTscout() {
		ImageIcon[] DATA = { MUSE, GEAR };
		int a = gene.nextInt(100) + 1;
		int i = 0;
		if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 || a == 7
				|| a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13
				|| a == 14 || a == 15 || a == 16 || a == 17 || a == 18
				|| a == 19 || a == 20) {
			int x = gene.nextInt(P.MUR.length);
			DATA[i] = P.MUR[x];
			MUltraRares++;
			UltraRares++;
		} else {
			int b = gene.nextInt(100) + 1;
			if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6
					|| b == 7 || b == 8 || b == 9 || b == 10 || b == 11
					|| b == 12 || b == 13 || b == 14 || b == 15 || b == 16
					|| b == 17 || b == 18 || b == 19 || b == 20) {
				int x = gene.nextInt(P.MeventSR.length);
				DATA[i] = P.MeventSR[x];
				SuperRares++;
				MSuperRares++;
			} else {
				int x = gene.nextInt(P.MSR.length);
				DATA[i] = P.MSR[x];
				SuperRares++;
				MSuperRares++;
			}
		}
		BT += 5;

		int x = JOptionPane.showOptionDialog(null, "Blue Ticket scouts"
				+ "Blue Tickets spent " + BT + "\n Total Number of cards: URs"
				+ UltraRares + " SRs " + SuperRares
				+ "\n Total Number of Muse cards: URs" + MUltraRares + " SRs "
				+ MSuperRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			BTscout();
		}
		if (x == 1) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of Blue Tickets spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				BT = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}
	}

	public void yoloAQscout() {
		ImageIcon[] DATA = { AQOURS, GEAR };
		int a = gene.nextInt(100) + 1;
		if (a == 1) {
			int x = gene.nextInt(P.AqUR.length);
			DATA[0] = P.AqUR[x];
			UltraRares++;
			AQUltraRares++;
		} else if (a == 2 || a == 3 || a == 4 || a == 5) {
			int x = gene.nextInt(P.AqSSR.length);
			DATA[0] = P.AqSSR[x];
			SuperSuperRares++;
			AQSuperSuperRares++;
		} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10 || a == 11
				|| a == 12 || a == 13 || a == 14 || a == 15 || a == 16
				|| a == 17 || a == 18 || a == 19 || a == 20) {
			int b = gene.nextInt(100);
			if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6
					|| b == 7 || b == 8 || b == 9 || b == 10 || b == 11
					|| b == 12 || b == 13 || b == 14 || b == 15 || b == 16
					|| b == 17 || b == 18 || b == 19 || b == 20) {
				int x = gene.nextInt(P.AqeventSR.length);
				DATA[0] = P.AqeventSR[x];
				SuperRares++;
				AQSuperRares++;
			} else {
				int x = gene.nextInt(P.AqSR.length);
				DATA[0] = P.AqSR[x];
				SuperRares++;
				AQSuperRares++;
			}
		} else {
			int y = gene.nextInt(P.AqR.length);
			DATA[0] = P.AqR[y];
			Rares++;
			AQRares++;
		}
		gemspent += 5;
		AQgemspent += 5;

		int x = JOptionPane.showOptionDialog(null, "Aquors soloyolos \n"
				+ "Total Gems spent " + gemspent + "\n Aquors gems spent "
				+ AQgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Aquors cards: URs" + AQUltraRares
				+ " SSRs " + AQSuperSuperRares + " SRs " + AQSuperRares
				+ " Rs " + AQRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			yoloAQscout();
		}
		if (x == 1) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				AQgemspent = 0;
				AQRares = 0;
				AQSuperSuperRares = 0;
				AQSuperRares = 0;
				AQUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}
	}

	public void yoloMscout() {
		ImageIcon[] DATA = { MUSE, GEAR };
		int a = gene.nextInt(100) + 1;
		int i = 0;
		if (a == 1) {
			int x = gene.nextInt(P.MUR.length);
			DATA[i] = P.MUR[x];
			MUltraRares++;
			UltraRares++;
		} else if (a == 2 || a == 3 || a == 4 || a == 5) {
			int x = gene.nextInt(P.MSSR.length);
			DATA[i] = P.MSSR[x];
			SuperSuperRares++;
			MSuperSuperRares++;
		} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10 || a == 11
				|| a == 12 || a == 13 || a == 14 || a == 15 || a == 16
				|| a == 17 || a == 18 || a == 19 || a == 20) {
			int b = gene.nextInt(100);
			if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6
					|| b == 7 || b == 8 || b == 9 || b == 10 || b == 11
					|| b == 12 || b == 13 || b == 14 || b == 15 || b == 16
					|| b == 17 || b == 18 || b == 19 || b == 20) {
				int x = gene.nextInt(P.MeventSR.length);
				DATA[i] = P.MeventSR[x];
				SuperRares++;
				MSuperRares++;
			} else {
				int x = gene.nextInt(P.MSR.length);
				DATA[i] = P.MSR[x];
				SuperRares++;
				MSuperRares++;
			}
		} else {
			int y = gene.nextInt(P.MR.length);
			DATA[i] = P.MR[y];
			MRares++;
			Rares++;
		}
		gemspent += 5;
		Mgemspent += 5;

		int x = JOptionPane.showOptionDialog(null, "Muse 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			yoloMscout();
		}
		if (x == 1) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}
	}

	ImageIcon AQOURS = new ImageIcon(Scout.class.getResource("AQOURS.png"));
	ImageIcon MUSE = new ImageIcon(Scout.class.getResource("MUSE.png"));
	ImageIcon BLUETICKET = new ImageIcon(Scout.class.getResource("BLUETICKET.png"));
	ImageIcon GEAR = new ImageIcon(Scout.class.getResource("GEAR.png"));
	ImageIcon COOL = new ImageIcon(Scout.class.getResource("COOL.png"));
	ImageIcon SMILE = new ImageIcon(Scout.class.getResource("SMILE.png"));
	ImageIcon PURE = new ImageIcon(Scout.class.getResource("PURE.png"));
	ImageIcon YEAR1 = new ImageIcon(Scout.class.getResource("1STYEARS.png"));
	ImageIcon YEAR2 = new ImageIcon(Scout.class.getResource("2NDYEARS.png"));
	ImageIcon YEAR3 = new ImageIcon(Scout.class.getResource("3RDYEARS.png"));
	ImageIcon LILY = new ImageIcon(Scout.class.getResource("LILYWHITE.png"));
	ImageIcon BIBI = new ImageIcon(Scout.class.getResource("BIBI.png"));
	ImageIcon TEMPS = new ImageIcon(Scout.class.getResource("PRINTEMPS.png"));
	ImageIcon MGEM = new ImageIcon(Scout.class.getResource("MuseGEM.png"));
	ImageIcon AQGEM = new ImageIcon(Scout.class.getResource("AQGEM.png"));
	ImageIcon MORE = new ImageIcon(Scout.class.getResource("MORE.png"));

	ImageIcon RIKO = new ImageIcon(Scout.class.getResource("rikocri.gif"));
	ImageIcon CRY = new ImageIcon(Scout.class.getResource("CRY.gif"));
	ImageIcon CRYMORE = new ImageIcon(Scout.class.getResource("crymore.png"));
	ImageIcon JUSTHONK = new ImageIcon(Scout.class.getResource("JustHonk.gif"));
	ImageIcon JUSTNICO = new ImageIcon(Scout.class.getResource("JustNico.gif"));
	ImageIcon JUSTNOZO = new ImageIcon(Scout.class.getResource("JustNozo.png"));
	ImageIcon JUSTPANA = new ImageIcon(Scout.class.getResource("JustPana.gif"));
	ImageIcon JUSTUMI = new ImageIcon(Scout.class.getResource("JustUmi.gif"));
	ImageIcon UMIJUST = new ImageIcon(Scout.class.getResource("UmiJust.png"));

	ImageIcon[] GIF = { RIKO, CRY, CRYMORE, JUSTHONK, JUSTNICO, JUSTNOZO,
			JUSTPANA, JUSTUMI, UMIJUST };

	public void settings() {
		// Includes all cards to most current from JP //As of 12/6/16 9:50 PM
		// EST
		int a = gene.nextInt(GIF.length);
		ImageIcon DATA[] = { MUSE, AQOURS, BLUETICKET, MORE };
		int x = JOptionPane.showOptionDialog(null,
				"Includes all cards to most current from JP //As of 12/6/16 9:50 PM EST"
						+ "\n 10 + 1s and Blue ticket", "Scouting Simulator",
				0, JOptionPane.INFORMATION_MESSAGE, GIF[a], DATA, DATA);
		if (x == 0) {
			Mscout();
		}
		if (x == 1) {
			AQscout();
		}
		if (x == 2) {
			BTscout();
		}
		if (x == 3) {
			int b = gene.nextInt(GIF.length);
			ImageIcon DATA4[] = { MGEM, AQGEM, MORE };
			int w = JOptionPane.showOptionDialog(null,
					"Includes all cards to most current from JP //As of 12/6/16 9:50 PM EST"
							+ "\n Soloyolos Muse and Aquors",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					GIF[b], DATA4, DATA4);
			if (w == 0) {
				yoloMscout();
			}
			if (w == 1) {
				yoloAQscout();
			}
			if (w == 2) {
				int c = gene.nextInt(GIF.length);
				ImageIcon DATA1[] = { LILY, BIBI, TEMPS, MORE };
				int y = JOptionPane.showOptionDialog(null,
						"Includes all cards to most current from JP //As of 12/6/16 9:50 PM EST"
								+ "\n Lily White, Bibi and Printemps scouting",
						"Scouting Simulator", 0,
						JOptionPane.INFORMATION_MESSAGE, GIF[c], DATA1, DATA1);
				if (y == 0) {
					lily();
				}
				if (y == 1) {
					bibi();
				}
				if (y == 2) {
					temps();
				}
				if (y == 3) {
					int d = gene.nextInt(GIF.length);
					ImageIcon DATA2[] = { COOL, SMILE, PURE, MORE };
					int z = JOptionPane.showOptionDialog(null,
							"Includes all cards to most current from JP //As of 12/6/16 9:50 PM EST "
									+ "\n Cool, Smile and Pure scouting",
							"Scouting Simulator", 0,
							JOptionPane.INFORMATION_MESSAGE, GIF[d], DATA2,
							DATA2);
					if (z == 0) {
						cool();
					}
					if (z == 1) {
						smile();
					}
					if (z == 2) {
						pure();
					}
					if (z == 3) {
						int e = gene.nextInt(GIF.length);
						ImageIcon DATA3[] = { YEAR1, YEAR2, YEAR3, MORE };
						int v = JOptionPane
								.showOptionDialog(
										null,
										"Includes all cards to most current from JP //As of 12/6/16 9:50 PM EST"
												+ "\n 1st years, 2nd years, and 3rd years scouting",
										"Scouting Simulator", 0,
										JOptionPane.INFORMATION_MESSAGE,
										GIF[e], DATA3, DATA3);
						if (v == 0) {
							year1();
						}
						if (v == 1) {
							year2();
						}
						if (v == 2) {
							year3();
						}
						if (v == 3) {
							settings();
						}
					}
				}
			}
		}
	}

	public void lily() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURlily.length);
					DATA[i] = P.MURlily[x];
					k++;
					MUltraRares++;
					UltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRlily.length);
					DATA[i] = P.MSSRlily[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvlily.length);
						DATA[i] = P.MSREvlily[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRlily.length);
						DATA[i] = P.MSRlily[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURlily.length);
					DATA[i] = P.MURlily[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRlily.length);
					DATA[i] = P.MSSRlily[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvlily.length);
						DATA[i] = P.MSRlily[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRlily.length);
						DATA[i] = P.MSRlily[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRlily.length);
					DATA[i] = P.MRlily[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Lily White 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			lily();
		}
		if (x == 1) {
			lily();
		}
		if (x == 2) {
			lily();
		}
		if (x == 3) {
			lily();
		}
		if (x == 4) {
			lily();
		}
		if (x == 5) {
			lily();
		}
		if (x == 6) {
			lily();
		}
		if (x == 7) {
			lily();
		}
		if (x == 8) {
			lily();
		}
		if (x == 9) {
			lily();
		}
		if (x == 10) {
			lily();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void bibi() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURbibi.length);
					DATA[i] = P.MURbibi[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRbibi.length);
					DATA[i] = P.MSSRbibi[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvbibi.length);
						DATA[i] = P.MSREvbibi[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRbibi.length);
						DATA[i] = P.MSRbibi[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURbibi.length);
					DATA[i] = P.MURbibi[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRbibi.length);
					DATA[i] = P.MSSRbibi[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvbibi.length);
						DATA[i] = P.MSREvbibi[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRbibi.length);
						DATA[i] = P.MSRbibi[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRbibi.length);
					DATA[i] = P.MRbibi[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "BIBI 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			bibi();
		}
		if (x == 1) {
			bibi();
		}
		if (x == 2) {
			bibi();
		}
		if (x == 3) {
			bibi();
		}
		if (x == 4) {
			bibi();
		}
		if (x == 5) {
			bibi();
		}
		if (x == 6) {
			bibi();
		}
		if (x == 7) {
			bibi();
		}
		if (x == 8) {
			bibi();
		}
		if (x == 9) {
			bibi();
		}
		if (x == 10) {
			bibi();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void temps() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURtemps.length);
					DATA[i] = P.MURtemps[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRtemps.length);
					DATA[i] = P.MSSRtemps[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvtemps.length);
						DATA[i] = P.MSREvtemps[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRtemps.length);
						DATA[i] = P.MSRtemps[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURtemps.length);
					DATA[i] = P.MURtemps[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRtemps.length);
					DATA[i] = P.MSSRtemps[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvtemps.length);
						DATA[i] = P.MSREvtemps[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRtemps.length);
						DATA[i] = P.MSRtemps[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRtemps.length);
					DATA[i] = P.MRtemps[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Printemps 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			temps();
		}
		if (x == 1) {
			temps();
		}
		if (x == 2) {
			temps();
		}
		if (x == 3) {
			temps();
		}
		if (x == 4) {
			temps();
		}
		if (x == 5) {
			temps();
		}
		if (x == 6) {
			temps();
		}
		if (x == 7) {
			temps();
		}
		if (x == 8) {
			temps();
		}
		if (x == 9) {
			temps();
		}
		if (x == 10) {
			temps();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void cool() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURcool.length);
					DATA[i] = P.MURcool[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRcool.length);
					DATA[i] = P.MSSRcool[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvcool.length);
						DATA[i] = P.MSREvcool[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRcool.length);
						DATA[i] = P.MSRcool[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURcool.length);
					DATA[i] = P.MURcool[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRcool.length);
					DATA[i] = P.MSSRcool[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvcool.length);
						DATA[i] = P.MSREvcool[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRcool.length);
						DATA[i] = P.MSRcool[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRcool.length);
					DATA[i] = P.MRcool[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Cool 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			cool();
		}
		if (x == 1) {
			cool();
		}
		if (x == 2) {
			cool();
		}
		if (x == 3) {
			cool();
		}
		if (x == 4) {
			cool();
		}
		if (x == 5) {
			cool();
		}
		if (x == 6) {
			cool();
		}
		if (x == 7) {
			cool();
		}
		if (x == 8) {
			cool();
		}
		if (x == 9) {
			cool();
		}
		if (x == 10) {
			cool();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void smile() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURsmile.length);
					DATA[i] = P.MURsmile[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRsmile.length);
					DATA[i] = P.MSSRsmile[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvsmile.length);
						DATA[i] = P.MSREvsmile[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRsmile.length);
						DATA[i] = P.MSRsmile[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURsmile.length);
					DATA[i] = P.MURsmile[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRsmile.length);
					DATA[i] = P.MSSRsmile[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvsmile.length);
						DATA[i] = P.MSREvsmile[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRsmile.length);
						DATA[i] = P.MSRsmile[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRsmile.length);
					DATA[i] = P.MRsmile[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Smile 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			smile();
		}
		if (x == 1) {
			smile();
		}
		if (x == 2) {
			smile();
		}
		if (x == 3) {
			smile();
		}
		if (x == 4) {
			smile();
		}
		if (x == 5) {
			smile();
		}
		if (x == 6) {
			smile();
		}
		if (x == 7) {
			smile();
		}
		if (x == 8) {
			smile();
		}
		if (x == 9) {
			smile();
		}
		if (x == 10) {
			smile();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void pure() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURpure.length);
					DATA[i] = P.MURpure[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRpure.length);
					DATA[i] = P.MSSRpure[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvpure.length);
						DATA[i] = P.MSREvpure[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRpure.length);
						DATA[i] = P.MSRpure[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURpure.length);
					DATA[i] = P.MURpure[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRpure.length);
					DATA[i] = P.MSSRpure[x];
					k++;
					SuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvpure.length);
						DATA[i] = P.MSREvpure[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRpure.length);
						DATA[i] = P.MSRpure[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRpure.length);
					DATA[i] = P.MRpure[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "Pure 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			pure();
		}
		if (x == 1) {
			pure();
		}
		if (x == 2) {
			pure();
		}
		if (x == 3) {
			pure();
		}
		if (x == 4) {
			pure();
		}
		if (x == 5) {
			pure();
		}
		if (x == 6) {
			pure();
		}
		if (x == 7) {
			pure();
		}
		if (x == 8) {
			pure();
		}
		if (x == 9) {
			pure();
		}
		if (x == 10) {
			pure();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void year1() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURyear1.length);
					DATA[i] = P.MURyear1[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRyear1.length);
					DATA[i] = P.MSSRyear1[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear1.length);
						DATA[i] = P.MSREvyear1[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear1.length);
						DATA[i] = P.MSRyear1[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURyear1.length);
					DATA[i] = P.MURyear1[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRyear1.length);
					DATA[i] = P.MSSRyear1[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear1.length);
						DATA[i] = P.MSREvyear1[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear1.length);
						DATA[i] = P.MSRyear1[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRyear1.length);
					DATA[i] = P.MRyear1[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "1st year 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			year1();
		}
		if (x == 1) {
			year1();
		}
		if (x == 2) {
			year1();
		}
		if (x == 3) {
			year1();
		}
		if (x == 4) {
			year1();
		}
		if (x == 5) {
			year1();
		}
		if (x == 6) {
			year1();
		}
		if (x == 7) {
			year1();
		}
		if (x == 8) {
			year1();
		}
		if (x == 9) {
			year1();
		}
		if (x == 10) {
			year1();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void year2() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURyear2.length);
					DATA[i] = P.MURyear2[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRyear2.length);
					DATA[i] = P.MSSRyear2[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear2.length);
						DATA[i] = P.MSREvyear2[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear2.length);
						DATA[i] = P.MSRyear2[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURyear2.length);
					DATA[i] = P.MURyear2[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRyear2.length);
					DATA[i] = P.MSSRyear2[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear2.length);
						DATA[i] = P.MSREvyear2[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear2.length);
						DATA[i] = P.MSRyear2[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRyear2.length);
					DATA[i] = P.MRyear2[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "2nd Year 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			year2();
		}
		if (x == 1) {
			year2();
		}
		if (x == 2) {
			year2();
		}
		if (x == 3) {
			year2();
		}
		if (x == 4) {
			year2();
		}
		if (x == 5) {
			year2();
		}
		if (x == 6) {
			year2();
		}
		if (x == 7) {
			year2();
		}
		if (x == 8) {
			year2();
		}
		if (x == 9) {
			year2();
		}
		if (x == 10) {
			year2();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

	public void year3() {
		ImageIcon[] DATA = { MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE, MUSE,
				MUSE, MUSE, MUSE, GEAR };
		int k = 0;
		for (int i = 0; i < 11; i++) {
			int a = gene.nextInt(100) + 1;
			if (i == 10 && k == 0) {
				int c = gene.nextInt(100) + 1;
				if (c == 1) {
					int x = gene.nextInt(P.MURyear3.length);
					DATA[i] = P.MURyear3[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (c == 2 || c == 3 || c == 4 || c == 5) {
					int x = gene.nextInt(P.MSSRyear3.length);
					DATA[i] = P.MSSRyear3[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear3.length);
						DATA[i] = P.MSREvyear3[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear3.length);
						DATA[i] = P.MSRyear3[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				}
			} else {
				if (a == 1) {
					int x = gene.nextInt(P.MURyear3.length);
					DATA[i] = P.MURyear3[x];
					k++;
					UltraRares++;
					MUltraRares++;
				} else if (a == 2 || a == 3 || a == 4 || a == 5) {
					int x = gene.nextInt(P.MSSRyear3.length);
					DATA[i] = P.MSSRyear3[x];
					k++;
					SuperSuperRares++;
					MSuperSuperRares++;
				} else if (a == 6 || a == 7 || a == 8 || a == 9 || a == 10
						|| a == 11 || a == 12 || a == 13 || a == 14 || a == 15
						|| a == 16 || a == 17 || a == 18 || a == 19 || a == 20) {
					int b = gene.nextInt(100);
					if (b == 1 || b == 2 || b == 3 || b == 4 || b == 5
							|| b == 6 || b == 7 || b == 8 || b == 9 || b == 10
							|| b == 11 || b == 12 || b == 13 || b == 14
							|| b == 15 || b == 16 || b == 17 || b == 18
							|| b == 19 || b == 20) {
						int x = gene.nextInt(P.MSREvyear3.length);
						DATA[i] = P.MSREvyear3[x];
						k++;
						SuperRares++;
						MSuperRares++;
					} else {
						int x = gene.nextInt(P.MSRyear3.length);
						DATA[i] = P.MSRyear3[x];
						k++;
						SuperRares++;
						MSuperRares++;
					}
				} else {
					int y = gene.nextInt(P.MRyear3.length);
					DATA[i] = P.MRyear3[y];
					Rares++;
					MRares++;
				}
			}
		}
		gemspent += 50;
		Mgemspent += 50;

		int x = JOptionPane.showOptionDialog(null, "3rd Year 10 + 1 Scouts"
				+ "Total Gems spent " + gemspent + "\n Muse gems spent "
				+ Mgemspent + "\n Total Number of cards: URs" + UltraRares
				+ " SSRs " + SuperSuperRares + " SRs " + SuperRares + " Rs "
				+ Rares + "\n Total Number of Muse cards: URs" + MUltraRares
				+ " SSRs " + MSuperSuperRares + " SRs " + MSuperRares + " Rs "
				+ MRares, "Scouting Simulator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if (x == 0) {
			year3();
		}
		if (x == 1) {
			year3();
		}
		if (x == 2) {
			year3();
		}
		if (x == 3) {
			year3();
		}
		if (x == 4) {
			year3();
		}
		if (x == 5) {
			year3();
		}
		if (x == 6) {
			year3();
		}
		if (x == 7) {
			year3();
		}
		if (x == 8) {
			year3();
		}
		if (x == 9) {
			year3();
		}
		if (x == 10) {
			year3();
		}
		if (x == 11) {
			String maybe[] = { "Yes", "No" };
			int y = JOptionPane.showOptionDialog(null,
					"Do you want to clear the number of gems spent?",
					"Scouting Simulator", 0, JOptionPane.INFORMATION_MESSAGE,
					null, maybe, maybe);
			if (y == 0) {
				gemspent = 0;
				Mgemspent = 0;
				MRares = 0;
				MSuperSuperRares = 0;
				MSuperRares = 0;
				MUltraRares = 0;
				Rares = 0;
				SuperSuperRares = 0;
				SuperRares = 0;
				UltraRares = 0;
				settings();
			}
			if (y == 1) {
				settings();
			}
		}

	}

}
