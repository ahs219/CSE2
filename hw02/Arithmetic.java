public class Arithmetic
{
    public static void main (String [] args)
    {
     //Number of pairs of socks
     int nSocks=3;
     //Cost per pair of socks
     //(‘$’ is part of the variable name)
     double sockCost$=2.58;
     //Number of drinking glasses
     int nGlasses=6;
     //Cost per glass
     double glassCost$=2.29;
     //Number of boxes of envelopes
     int nEnvelopes=1;
     //cost per box of envelopes
     double envelopeCost$=3.25;
     double taxPercent=0.06;
     
     double totalSockCost$;   //total cost of socks
     double totalGlassCost$;  //total cost of drinking glass
     double totalEnvelopeCost$; //total cost of envelopes
     
     double oneSockTax1 = (int)((sockCost$ * taxPercent)*100); // I created one variable for the sales tax for one sock and casted it to an int
     double oneSockTax = oneSockTax1/100; // have to divide by 100 to make it a readable number
     double costOfSocks = nSocks * sockCost$; // I created one variable for the cost of all socks (before tax)
     double allSockTax1 = (int) ((oneSockTax * nSocks) * 100); // I created one variable for the accumulation of taxes for all socks and casted it to an int
     double allSockTax = allSockTax1/100; // have to divide by 100 to make it a readable number
     double socksAfterTax = costOfSocks + allSockTax; // created one variable for the total cost of the socks after tax
     
     double oneEnvelopeTax1 = (int)((envelopeCost$ * taxPercent)*100); // I created one variable for the sales tax for one envelope and casted it to an int
     double oneEnvelopeTax = oneEnvelopeTax1/100; // have to divide by 100 to make it a readable number
     double costOfEnvelopes = nEnvelopes * envelopeCost$; // I created one variable for the cost of all envelopes (before tax)
     double allEnvelopeTax1 = (int) ((oneEnvelopeTax * nEnvelopes) * 100);  // I created one variable for the accumulation of taxes for all envelopes and casted it to an int
     double allEnvelopeTax = allEnvelopeTax1/100; // have to divide by 100 to make it a readable number
     double envelopesAfterTax = costOfEnvelopes + allEnvelopeTax; // created one variable for the total cost of the envelopes after tax
     
     double oneGlassTax1 = (int)((glassCost$ * taxPercent)*100); // I created one variable for the sales tax for one glass and casted it to an int
     double oneGlassTax = oneGlassTax1/100; // have to divide by 100 to make it a readable number
     double costOfGlasses = nGlasses * glassCost$; // I created one variable for the cost of all glasses (before tax)
     double allGlassTax1 = (int) ((oneGlassTax * nGlasses) * 100); // I created one variable for the accumulation of taxes for all glasses and casted it to an int
     double allGlassTax = allGlassTax1/100; // have to divide by 100 to make it a readable number
     double glassesAfterTax = costOfGlasses + allGlassTax; // created one variable for the total cost of the glasses after tax
     
     double totalPurchasesBeforeTax = (costOfSocks + costOfGlasses + costOfEnvelopes); // created a variable for the totatl purchases before tax
     double totalPurchasesAfterTax = (socksAfterTax + glassesAfterTax + envelopesAfterTax); // created a variable for the total purchases after tax
     double totalSalesTax1 = (int) ((totalPurchasesAfterTax - totalPurchasesBeforeTax)*100); // created a variable for the total sales tax for all the items
     double totalSalesTax = totalSalesTax1/100;
    
     
     //prints what product it is, the quantity of the item, and the cost per item
     System.out.println("Product: Socks ");
     System.out.println("Quantity: " + nSocks);
     System.out.println("Cost per item: " + sockCost$);
     
     //prints what product it is, the quantity of the item, and the cost per item
     System.out.println("Product: Glass ");
     System.out.println("Quantity: " + nGlasses);
     System.out.println("Cost per item: " + glassCost$);
     
     //prints what product it is, the quantity of the item, and the cost per item
     System.out.println("Product: Envelope ");
     System.out.println("Quantity: " + nEnvelopes);
     System.out.println("Cost per item: " + envelopeCost$);
     
     //prints out the cost for the item before tax, sales tax for one of the item, sales tax for all of the item, and the cost of all of the item after tax
     System.out.println("Cost for socks before tax: " +costOfSocks);
     System.out.println("Sales tax for one sock: " + oneSockTax);
     System.out.println("Sales tax for all socks " + allSockTax);
     System.out.println("Cost of socks after tax " + socksAfterTax);
     
     //prints out the cost for the item before tax, sales tax for one of the item, sales tax for all of the item, and the cost of all of the item after tax
     System.out.println("Cost for glasses before tax: " +costOfGlasses);
     System.out.println("Sales tax for one glass: " + oneGlassTax);
     System.out.println("Sales tax for all glasses " + allGlassTax);
     System.out.println("Cost of glasses after tax " + glassesAfterTax);
     
     //prints out the cost for the item before tax, sales tax for one of the item, sales tax for all of the item, and the cost of all of the item after tax
     System.out.println("Cost for envelopes before tax: " +costOfEnvelopes);
     System.out.println("Sales tax for one envelope: " + oneEnvelopeTax);
     System.out.println("Sales tax for all envelopes " + allEnvelopeTax);
     System.out.println("Cost of envelopes after tax " + envelopesAfterTax);
     
     //prints out the total cost of purchases (all items) before and after tax, as well as the total sales tax
     System.out.println("Total cost of purchases before tax: " + totalPurchasesBeforeTax);
     System.out.println("Total cost of purchases after tax: " + totalPurchasesAfterTax);
     System.out.println("Total sales tax: " + totalSalesTax);
     
     

    }
}