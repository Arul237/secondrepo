package com.onesoft.fifteen.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMovie {

	public static void main(String[] args) {
		
        Movie m1=new Movie("sooraipotrru",2020,"suriya ",7.5);
        Movie m2=new Movie("cold case ",2021,"prithiveraj",5.7);
        Movie m3=new Movie("thalli pogathey",2021,"atharva ",5.8);
        Movie m4=new Movie("trance",2020,"Fahadh Faasil ",5.4);
        Movie m5=new Movie("sooraipotrru",2020,"suriya ",7.5);
        Movie m6=new Movie("biskoth",2020,"santhanam",8.5);
        Movie m7=new Movie("pettai",2019,"rajini",9.5);
    	ArrayList<Movie> movies=new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);
        movies.add(m7);
        Long a=movies.stream().filter(x->x.getYear()==2022).count();
        System.out.println(a);
   // List type     
        List<Movie> n=movies.stream().filter(x->x.getYear()==2022).collect(Collectors.toList());// stream -> filter(condition) ->collect values
	System.out.println(n);
	List<Movie> tm=movies.stream().filter(y->y.getYear()==2020 && y.getRating()>=5.7).collect(Collectors.toList());// stream ->filter(condition ,condition) ->collect values
	System.out.println(tm);
	
	List<String> nn=movies.stream().filter(f->f.getRating()<=4.5).map(r->r.getMovieName()).collect(Collectors.toList());
	System.out.println(nn);
	
	//map -> interface
	//map() -> stream
	//toMap() -> Collectors
  // map type
	// key value of getmoviename it is unique name so using key
	// value of the actor name
	Map<String,Movie> tp=movies.stream().filter(w->w.getActor().equalsIgnoreCase("Fahadh Faasil ")).collect(Collectors.toMap(s->s.getMovieName(), r->r));
	System.out.println(tp);
	
	Double total=movies.stream().collect(Collectors.summingDouble(y->y.getRating()));
	System.out.println(total);
	Double average=movies.stream().collect(Collectors.averagingDouble(z->z.getRating()));
	System.out.println(average);
	Double add=movies.stream().collect(Collectors.summingDouble(Movie::getRating));
	System.out.println(add);
	Double avg=movies.stream().collect(Collectors.averagingDouble(Movie::getRating));
	System.out.println(avg);
	//boolean answer = List.stream().anyMatch(n->  4 == 5);
	  boolean answer = movies.stream().anyMatch(s ->s.getMovieName()==s.getActor());
	  
	System.out.println(answer);
	//Double average=movies.stream().max(Movie::getRating);
	//System.out.println(average);
	System.out.println(" ************8");
     movies.stream().distinct().forEach(System.out::println);
    // movies.stream().flatMapToDouble(x -> x.stream()).forEach(System.out::println);
     Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9) .max(Comparator.comparing(Integer::valueOf)).get();
     System.out.println(maxNumber);
     Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();      
    System.out.println(minNumber);
  
     
	}

}
