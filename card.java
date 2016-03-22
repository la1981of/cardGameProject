package anthony.com;

public class card {

    public card() {
    }

    public static void main(String[] args) {
        System.out.println("Testing the card Class");
        card test = new card();




        test.cardToString();
        test.cardToStringBrief();
        test.cardToDeckValue();
        test.cardEquals();
    }
    // cardEqual() method

    private void cardEquals() {
    }
    // cardToDeckValue() Method
    private void cardToDeckValue() {
        System.out.println("\n****** Cards.toDeckValue():****");
        for (int i =1; i<=4; i++){
            for (int j=2; j<=4; j++)

            {
                System.out.println((new card().toString() + ":" ));
            }
        }
    }



    // CardToStringBrief Method
    private void cardToStringBrief() {
        for (int i =1; i<=52; i++){
            card card = new card();
        }

    }

    private void cardToString() {
        System.out.println("\n****** Cards.toString():****");
        for (int i = 1; i <= 52; i++){
            card card = new card();

            System.out.println(card.toString());
            if (i% 13==0){
                System.out.println();
            }
        }
    }
}
