import java.lang.management.MonitorInfo;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8,9);
        //streams ---   filtering , sorting , generating ,  piping

        // imperative programing
        //int counter =0;
        //for(var value:list){
        //    if (value>5)
        //        counter++;
        //}

        //declarative (Functional) programing
        //var s= list.stream().filter(value->value>5).count();
        //   select * from table where id > 5
//
        //var stream = Arrays.stream(new String[]{"hodi", "alexsey", "oz"});
//
        //var stream2 = Stream.generate(()-> Math.random());
//
        //stream2.
        //        limit(4).
        //        filter(x->x>0.5).
        //        forEach(d->System.out.println(d));

       // var movies = List.of(
       //         new Movie("fast 5", 7.8,2014),
       //         new Movie("batman", 4.3,1998),
       //         new Movie("the batman", 1.8,2022),
       //         new Movie("Deadpool", 8.8,2017),
       //         new Movie("hitch", 2.3,2005)
       // );
        //imp  HOW ?
       //List<String> s= new ArrayList<>();
       //for (var obj:movies) {
       //    s.add(obj.getTitle());
       //}
       //for(String string : s){
       //    System.out.println(string);
       //}
//
       //movies.stream()
       //        .map(Movie::getTitle)
       //        .forEach(str-> System.out.println(str));
//
       //movies.stream()
       //        .map(movie->movie.getYear())
       //        .forEach(str-> System.out.println(str));

        //var list3= List.of(
        //        List.of(1,2,3,4),
        //        List.of(2,1,2,3),
        //        List.of(3,2,1,2),
        //        List.of(4,3,2,1)
        //);
//
        //list3.stream()
        //        .flatMap(l->l.stream())
        //        .forEach(l-> System.out.println(l));
//

        // slicing
        // limit   10
        // skip     10
        // takewhile  con  all until the first false(לא כולל)
        // dropwhile   con  all from the first false(כןלל)
        var movies = List.of(
                        new Movie("fast 5", 7.8,2014),
                        new Movie("fast 5", 7.8,2014),
                        new Movie("fast 5", 7.8,2014),
                        new Movie("batman", 4.3,1998),
                        new Movie("the batman", 1.8,2022),
                        new Movie("the batman", 1.8,2022),
                        new Movie("the batman", 1.8,2022),
                        new Movie("Deadpool", 8.8,2017),
                        new Movie("hitch", 2.3,2005)
        );

        // obj = 100
        // pagesNumber= 1->5
        // objectperpage=20
        // skip((pagesNumber-1)*objectperpage)

       // movies.stream()
       //         .skip(2)
       //         .limit(1)
       //         .forEach(movie -> System.out.println(movie));
        //movies.stream()
        //        .dropWhile(movie-> movie.getRank()>2)
        //        .forEach(System.out :: println);


        //sorting
        //movies.stream()
        //        .sorted(Comparator.comparing(Movie::getYear))
        //        .forEach(System.out::println);

        //movies.stream()
        //        .map(movie -> movie.getTitle())
        //        .distinct()
        //        .forEach(System.out::println);
//
        //Stream.iterate(8,n->n+1).limit(10).forEach(System.out::println);



    }
}
