package Java8Quns;

public class SplitChar {

	public static void main(String args[]) {
		SplitChar splitChar = new SplitChar();
		String displayString = splitChar.winners(new String[] {"Arun 9 9 9","kumar 10 10 10","bandaru 10 10 10" });
		System.out.println(displayString);
	}

	public static String winners(String[] participantsList) {
		double[] average = new double[participantsList.length];
		java.util.Map<String, Double> averages = new java.util.LinkedHashMap<String, Double>();
		for (int i = 0; i < participantsList.length; i++) {
			String participant = participantsList[i];
			String[] words = participant.trim().split("\\W+");
			int sumOfScores = 0;
			int numberOfScores = 0;
			StringBuffer participantName = new StringBuffer();
			for (String word : words) {
				try {
					sumOfScores += Integer.parseInt(word);
					numberOfScores++;
				} catch (NumberFormatException ex) {
					participantName.append(word).append(" ");
				}
			}
			averages.put(participantName.toString(), new Double(sumOfScores / numberOfScores));

		}
		
		System.out.println(averages);

		java.util.Map<String, Double> sortedAverages = averages.entrySet().stream()
				.sorted(java.util.Map.Entry.<String, Double>comparingByValue())
				.collect(java.util.stream.Collectors.toMap(java.util.Map.Entry::getKey, java.util.Map.Entry::getValue,
						(x, y) -> y, java.util.LinkedHashMap::new));

		java.util.Iterator it = sortedAverages.entrySet().iterator();
		int i = 0;
		String[] winners = new String[3];

		while (it.hasNext() && (i < 3)) {
			java.util.Map.Entry<String, Double> entry = (java.util.Map.Entry) it.next();

			if (entry.getKey().toString() != null) {
				winners[i] = entry.getKey().toString().trim();
			} else {
				winners[i] = "";
			}

			Double previousScore = entry.getValue();
			i++;
		}

		StringBuilder sbWinners = new StringBuilder();
		sbWinners.append("The 1st place:").append(winners[2]).append(";The 2nd place:").append(winners[1])
				.append(";The 3rd place:").append(winners[0]).append(";");

		return sbWinners.toString();
	}

}
