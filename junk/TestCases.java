class TestCases{

    public static void main(String arg[])
    {
        int testCaseNo=1;
        String[]  altworksch={"Alternate week work 12 hours 5days and 12 hours for 2 days schedule","Normal 5 day work schedule", "Different work schedule for each day" };
        String testCase1="Create a leave for the employee having work schedule like: ";
        String testCase2="Validate the entitlement of the policy which has Unit type is correct ";
        String[] strArray={"Work Days","Calendar Days","Hours","Weeks","Minutes" };
       
            for (String alt : altworksch) {

                for (String strarray : strArray) {
                   
                    System.out.println( testCaseNo+": " +testCase1+ alt + testCase2 + strarray );
                    testCaseNo++;
                }

                
            }
        
        
    


    }
}