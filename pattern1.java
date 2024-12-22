public class pattern1 // pattern to print right angle traingle
{
    public static void main(String[] args) {
        int i;
        int j;

         for(i=1;i<6;i++)//for rows
        {
             for(j=0;j<i;j++)//for columns 
             {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    
}
