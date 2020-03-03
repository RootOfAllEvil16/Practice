public class DNA{
    //DNA
    public static void main(String[] args){
        //3 strings of DNA
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        //Generic string var
        String dna = dna1;
        //String dna = dna2;
        //String dna = dna3;
        //find the length of DNA string
        int length = dna.length();
        System.out.println("Length: " + length);
        //find start index of ATG
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
        //find stop index of TGA
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);
        //if statement checks for a start codon and stop codon.will return -1 if substring doesn`t exist within a string
        if(start != -1 && stop != -1){
            System.out.println("1 and 2 are satisfied");
        }
        //if number of nucleotides in between start codon and stop codon is a multiple of 3. modolo % returns reminder of a division
        if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
            System.out.println("1, 2 and 3 are satisfied");
            //create a string protein. find protein in dna using substring() method. codon is 3 long so we add +3.
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein " + protein);
        }
        //else for no protein case
        else{
            System.out.println("No protein");
        }

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
    }
}