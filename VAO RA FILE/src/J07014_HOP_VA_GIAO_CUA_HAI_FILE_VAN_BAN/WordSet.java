package J07014_HOP_VA_GIAO_CUA_HAI_FILE_VAN_BAN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            this.set.add(s);
        }
    }

    WordSet(TreeSet<String> a){
        this.set = a;
    }
    WordSet union(WordSet b){
        TreeSet<String> a = (TreeSet<String>) this.set.clone();
        for(String x:b.set){
            a.add(x);
        }
        return new WordSet(a);
    }

    WordSet intersection(WordSet b){
        TreeSet<String> x = (TreeSet<String>) this.set.clone();
        TreeSet<String> y = b.set;
        x.retainAll(y);
        return new WordSet(x);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(String x: set){
            sb.append(x + " ");
        }
        return sb.toString();
    }
}
