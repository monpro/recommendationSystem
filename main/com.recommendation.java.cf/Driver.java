
public class Driver {
	public static void main(String[] args) throws Exception {
		
		DataDividerByUser dataDividerByUser = new DataDividerByUser();
		CoOccurrenceMatrixGenerator coOccurrenceMatrixGenerator = new CoOccurrenceMatrixGenerator();
		Normalize normalize = new Normalize();
		Multiplication multiplication = new Multiplication();
		Sum sum = new Sum();

		String rawInput = "input";
		String userMovieListOutputDir = "dataDividedByUser";
		String coOccurrenceMatrixDir = "coOccurrenceMatrix";
		String normalizeDir = "Normalize";
		String multiplicationDir = "Multiplication";
		String sumDir = "Sum";
		String[] path1 = {rawInput, userMovieListOutputDir};
		String[] path2 = {userMovieListOutputDir, coOccurrenceMatrixDir};
		String[] path3 = {coOccurrenceMatrixDir, normalizeDir};
		String[] path4 = {normalizeDir, rawInput, multiplicationDir};
		String[] path5 = {multiplicationDir, sumDir};
		
		dataDividerByUser.main(path1);
		coOccurrenceMatrixGenerator.main(path2);
		normalize.main(path3);
		multiplication.main(path4);
		sum.main(path5);

	}

}
