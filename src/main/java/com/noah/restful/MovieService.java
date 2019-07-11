package com.noah.restful;

import com.google.gson.Gson;
import com.noah.model.Movie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.*;


@Path("/")
public class MovieService {

    private static Gson gson = new Gson();

    @Path("/index")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getIndex() {
        InputStream inputStream = this.getClass().getResourceAsStream("/index.html");
        return Response.ok(inputStream).build();
    }

    @Path("/index_bundle.js")
    @GET
    @Produces("application/x-javascript")
    public Response getIndexJs() {
        InputStream inputStream = this.getClass().getResourceAsStream("/index_bundle.js");
        return Response.ok(inputStream).build();
    }

    @Path("/assets/imgs/{imgName}")
    @GET
    @Produces("application/x-jpg")
    public Response getIndexImg(@PathParam("imgName") String imgName) {
        InputStream inputStream = this.getClass().getResourceAsStream("/assets/imgs/" + imgName);
        return Response.ok(inputStream).build();
    }

    @Path("/app/movies")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovies() {
        Map<String, List<Movie>> result = new HashMap<>();
        List<Movie> movies = constructMovieList();
        result.put("movies", movies);
        String json = gson.toJson(result);
        return Response.ok(json).build();
    }

    private List<Movie> constructMovieList() {

        Movie movie_1 = new Movie();
        movie_1.setName("The Dark Knight");
        movie_1.setDescription("When Batman, Gordon and Harvey Dent launch an assault on the mob, they let the clown out of the box, the Joker, bent on turning Gotham on itself and bringing any heroes down to his level.");
        movie_1.setImdbUrl("https://www.imdb.com/title/tt0468569/");
        movie_1.setPosterFileUrl("/assets/imgs/batman.jpg");
        movie_1.setTags(Arrays.asList("sci-fi", "drama", "crime"));
        movie_1.setType("movie");

        Movie movie_2 = new Movie();
        movie_2.setName("Pulp Fiction");
        movie_2.setDescription("The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.");
        movie_2.setImdbUrl("https://www.imdb.com/title/tt0110912/");
        movie_2.setPosterFileUrl("/assets/imgs/pulpfiction.jpg");
        movie_2.setTags(Arrays.asList("drama", "crime"));
        movie_2.setType("movie");

        Movie movie_3 = new Movie();
        movie_3.setName("Seven Sins");
        movie_3.setDescription("Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his modus operandi.");
        movie_3.setImdbUrl("https://www.imdb.com/title/tt0114369/");
        movie_3.setPosterFileUrl("/assets/imgs/sevensins.jpg");
        movie_3.setTags(Arrays.asList("drama", "crime"));
        movie_3.setType("movie");

        Movie movie_4 = new Movie();
        movie_4.setName("The Lord Of Ring");
        movie_4.setDescription("Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring");
        movie_4.setImdbUrl("https://www.imdb.com/title/tt0120737/");
        movie_4.setPosterFileUrl("/assets/imgs/lordofring.jpg");
        movie_4.setTags(Arrays.asList("history", "sci-fi", "drama"));
        movie_4.setType("movie");

        Movie movie_5 = new Movie();
        movie_5.setName("One Flew Over the Cuckoo's Nest");
        movie_5.setDescription("Upon admittance to a mental institution, a brash rebel rallies the patients to take on the oppressive head nurse.");
        movie_5.setImdbUrl("https://www.imdb.com/title/tt0073486/");
        movie_5.setPosterFileUrl("assets/imgs/flyingphyco.jpg");
        movie_5.setTags(Arrays.asList("drama", "tragedy"));
        movie_5.setType("movie");

        Movie movie_6 = new Movie();
        movie_6.setName("Gladiator");
        movie_6.setDescription("When Batman, Gordon and Harvey Dent launch an assault on the mob, they let the clown out of the box, the Joker, bent on turning Gotham on itself and bringing any heroes down to his level.");
        movie_6.setImdbUrl("https://www.imdb.com/title/tt0172495/");
        movie_6.setPosterFileUrl("/assets/imgs/gladiator.jpg");
        movie_6.setTags(Arrays.asList("history", "action", "drama"));
        movie_6.setType("movie");

        Movie movie_7 = new Movie();
        movie_7.setName("Snatch");
        movie_7.setDescription("Unscrupulous boxing promoters, violent bookmakers, a Russian gangster, incompetent amateur robbers, and supposedly Jewish jewelers fight to track down a priceless stolen diamond.");
        movie_7.setImdbUrl("https://www.imdb.com/title/tt0208092/");
        movie_7.setPosterFileUrl("/assets/imgs/snatch.jpg");
        movie_7.setTags(Arrays.asList("action", "drama"));
        movie_7.setType("movie");

        Movie movie_8 = new Movie();
        movie_8.setName("Eternal Sunshine Of The Spotless Mind");
        movie_8.setDescription("A couple undergo a procedure to erase each other from their memories when their relationship turns sour, but it is only through the process of loss that they discover what they had to begin with..");
        movie_8.setImdbUrl("https://www.imdb.com/title/tt0338013/");
        movie_8.setPosterFileUrl("/assets/imgs/eternalsunshineofthespotlessmind.jpg");
        movie_8.setTags(Arrays.asList("drama", "romance"));
        movie_8.setType("movie");

        Movie movie_9 = new Movie();
        movie_9.setName("Lord Of War");
        movie_9.setDescription("An arms dealer confronts the morality of his work as he is being chased by an Interpol agent.");
        movie_9.setImdbUrl("https://www.imdb.com/title/tt0399295/");
        movie_9.setPosterFileUrl("/assets/imgs/lordofwar.jpg");
        movie_9.setTags(Arrays.asList("drama", "crime"));
        movie_9.setType("movie");

        Movie movie_10 = new Movie();
        movie_10.setName("Road to Perdition");
        movie_10.setDescription("Bonds of loyalty are put to the test when a hitman's son witnesses what his father does for a living.");
        movie_10.setImdbUrl("https://www.imdb.com/title/tt0257044");
        movie_10.setPosterFileUrl("/assets/imgs/roadtoperdition.jpg");
        movie_10.setTags(Arrays.asList("drama", "crime"));
        movie_10.setType("movie");

        Movie movie_11 = new Movie();
        movie_11.setName("Wreck-It Ralph");
        movie_11.setDescription("A video game villain wants to be a hero and sets out to fulfill his dream, but his quest brings havoc to the whole arcade where he lives.");
        movie_11.setImdbUrl("https://www.imdb.com/title/tt1772341/");
        movie_11.setPosterFileUrl("/assets/imgs/wreckit.jpg");
        movie_11.setTags(Arrays.asList("action", "comedy"));
        movie_11.setType("movie");

        Movie movie_12 = new Movie();
        movie_12.setName("Despicable Me");
        movie_12.setDescription("When a criminal mastermind uses a trio of orphan girls as pawns for a grand scheme, he finds their love is profoundly changing him for the better.");
        movie_12.setImdbUrl("https://www.imdb.com/title/tt1323594/");
        movie_12.setPosterFileUrl("/assets/imgs/despicableme.jpg");
        movie_12.setTags(Arrays.asList("drama", "comedy"));
        movie_12.setType("movie");

        Movie movie_13 = new Movie();
        movie_13.setName("Babel");
        movie_13.setDescription("Tragedy strikes a married couple on vacation in the Moroccan desert, touching off an interlocking story involving four different families.");
        movie_13.setImdbUrl("https://www.imdb.com/title/tt0449467/");
        movie_13.setPosterFileUrl("/assets/imgs/babel.jpg");
        movie_13.setTags(Arrays.asList("drama"));
        movie_13.setType("movie");

        Movie movie_14 = new Movie();
        movie_14.setName("Pride And Prejudice");
        movie_14.setDescription("Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class. Can each overcome their own pride and prejudice?");
        movie_14.setImdbUrl("https://www.imdb.com/title/tt0414387/");
        movie_14.setPosterFileUrl("/assets/imgs/prideandprejudice.jpg");
        movie_14.setTags(Arrays.asList("drama", "romance"));
        movie_14.setType("movie");

        Movie movie_15 = new Movie();
        movie_15.setName("Seven Pounds");
        movie_15.setDescription("A man with a fateful secret embarks on an extraordinary journey of redemption by forever changing the lives of seven strangers.");
        movie_15.setImdbUrl("https://www.imdb.com/title/tt0814314/");
        movie_15.setPosterFileUrl("/assets/imgs/sevenpounds.jpg");
        movie_15.setTags(Arrays.asList("drama"));
        movie_15.setType("movie");

        Movie movie_16 = new Movie();
        movie_16.setName("Kung Fu Panda 2");
        movie_16.setDescription("Po and his friends fight to stop a peacock villain from conquering China with a deadly new weapon, but first the Dragon Warrior must come to terms with his past.");
        movie_16.setImdbUrl("https://www.imdb.com/title/tt1302011/");
        movie_16.setPosterFileUrl("/assets/imgs/kongfupanda2.jpg");
        movie_16.setTags(Arrays.asList("comedy", "action"));
        movie_16.setType("movie");

        Movie movie_17 = new Movie();
        movie_17.setName("Avatar");
        movie_17.setDescription("A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.");
        movie_17.setImdbUrl("https://www.imdb.com/title/tt0499549/");
        movie_17.setPosterFileUrl("/assets/imgs/avatar.jpg");
        movie_17.setTags(Arrays.asList("action", "romance", "sci-fi"));
        movie_17.setType("movie");

        Movie movie_18 = new Movie();
        movie_18.setName("Life Is Beautiful");
        movie_18.setDescription("A Jewish man has a wonderful romance with the help of his humour, but must use that same quality to protect his son in a Nazi death camp.");
        movie_18.setImdbUrl("https://www.imdb.com/title/tt0118799/");
        movie_18.setPosterFileUrl("/assets/imgs/lifeisbeautiful.jpg");
        movie_18.setTags(Arrays.asList("comedy", "tragedy", "romance"));
        movie_18.setType("movie");


        Movie movie_19 = new Movie();
        movie_19.setName("Titanic");
        movie_19.setDescription("A seventeen-year-old aristocrat, expecting to be married to a rich claimant by her mother, falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.");
        movie_19.setImdbUrl("https://www.imdb.com/title/tt0120338/");
        movie_19.setPosterFileUrl("/assets/imgs/titanic.jpg");
        movie_19.setTags(Arrays.asList("tragedy", "romance"));
        movie_19.setType("movie");

        Movie movie_20 = new Movie();
        movie_20.setName("Skyfall");
        movie_20.setDescription("Bond's loyalty to M is tested when her past comes back to haunt her. Whilst MI6 comes under attack, 007 must track down and destroy the threat, no matter how personal the cost.");
        movie_20.setImdbUrl("https://www.imdb.com/title/tt1074638/");
        movie_20.setPosterFileUrl("/assets/imgs/skyfall.jpg");
        movie_20.setTags(Arrays.asList("drama", "action"));
        movie_20.setType("movie");


        Movie movie_21 = new Movie();
        movie_21.setName("The Notebook");
        movie_21.setDescription("A poor and passionate young man falls in love with a rich young woman and gives her a sense of freedom. They soon are separated by their social differences.");
        movie_21.setImdbUrl("https://www.imdb.com/title/tt0332280/");
        movie_21.setPosterFileUrl("/assets/imgs/thenotebook.jpg");
        movie_21.setTags(Arrays.asList("comedy", "romance"));
        movie_21.setType("movie");


        Movie movie_22 = new Movie();
        movie_22.setName("Mission Impossible");
        movie_22.setDescription("An American agent, under false suspicion of disloyalty, must discover and expose the real spy without the help of his organization.");
        movie_22.setImdbUrl("https://www.imdb.com/title/tt0117060/");
        movie_22.setPosterFileUrl("/assets/imgs/missionimpossible.jpg");
        movie_22.setTags(Arrays.asList("drama", "sci-fi"));
        movie_22.setType("movie");

        Movie movie_23 = new Movie();
        movie_23.setName("This Is Us");
        movie_23.setDescription("A heartwarming and emotional story about a unique set of triplets, their struggles, and their wonderful parents.");
        movie_23.setImdbUrl("https://www.imdb.com/title/tt5555260/");
        movie_23.setPosterFileUrl("/assets/imgs/thisisus.jpg");
        movie_23.setTags(Arrays.asList("drama", "romance"));
        movie_23.setType("serial");

        Movie movie_24 = new Movie();
        movie_24.setName("Breaking Bad");
        movie_24.setDescription("A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.");
        movie_24.setImdbUrl("https://www.imdb.com/title/tt0903747/");
        movie_24.setPosterFileUrl("/assets/imgs/breakingbad.jpg");
        movie_24.setTags(Arrays.asList("crime", "drama"));
        movie_24.setType("serial");

        Movie movie_25 = new Movie();
        movie_25.setName("West World");
        movie_25.setDescription("Set at the intersection of the near future and the reimagined past, explore a world in which every human appetite can be indulged without consequence.");
        movie_25.setImdbUrl("https://www.imdb.com/title/tt0475784/");
        movie_25.setPosterFileUrl("/assets/imgs/westworld.jpg");
        movie_25.setTags(Arrays.asList("sci-fi", "drama"));
        movie_25.setType("serial");

        Movie movie_26 = new Movie();
        movie_26.setName("Lie to Me");
        movie_26.setDescription("About Cal Lightman, the world's leading deception expert who studies facial expressions and involuntary body language to expose the truth behind the lies.");
        movie_26.setImdbUrl("https://www.imdb.com/title/tt1235099/");
        movie_26.setPosterFileUrl("/assets/imgs/lietome.jpg");
        movie_26.setTags(Arrays.asList("drama", "crime"));
        movie_26.setType("serial");

        Movie movie_27 = new Movie();
        movie_27.setName("Prison Break");
        movie_27.setDescription("Due to a political conspiracy, an innocent man is sent to death row and his only hope is his brother, who makes it his mission to deliberately get himself sent to the same prison in order to break the both of them out, from the inside.");
        movie_27.setImdbUrl("https://www.imdb.com/title/tt0455275/");
        movie_27.setPosterFileUrl("/assets/imgs/prisonbreak.jpg");
        movie_27.setTags(Arrays.asList("drama", "crime"));
        movie_27.setType("serial");

        Movie movie_28 = new Movie();
        movie_28.setName("Friends");
        movie_28.setDescription("Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan.");
        movie_28.setImdbUrl("https://www.imdb.com/title/tt0108778/");
        movie_28.setPosterFileUrl("/assets/imgs/friends.jpg");
        movie_28.setTags(Arrays.asList("comedy", "romance"));
        movie_28.setType("serial");

        Movie movie_29 = new Movie();
        movie_29.setName("The Wandering Earth");
        movie_29.setDescription("As the sun is dying out, people all around the world build giant planet thrusters to move Earth out of its orbit and sail Earth to a new star system. Yet the 2500-year journey comes with unexpected dangers, and in order to save humanity, a group of young people in this age of a wandering Earth fight hard for the survival of humankind.");
        movie_29.setImdbUrl("https://www.imdb.com/title/tt7605074/");
        movie_29.setPosterFileUrl("/assets/imgs/thewanderingearth.jpg");
        movie_29.setTags(Arrays.asList("sci-fi", "action", "comedy"));
        movie_29.setType("movie");

        Movie movie_30 = new Movie();
        movie_30.setName("Designated Survivor");
        movie_30.setDescription("A low-level Cabinet member becomes President of the United States after a catastrophic attack kills everyone above him in the line of succession.");
        movie_30.setImdbUrl("https://www.imdb.com/title/tt5296406/");
        movie_30.setPosterFileUrl("/assets/imgs/designatedsurvivor.jpg");
        movie_30.setTags(Arrays.asList("action", "drama"));
        movie_30.setType("serial");

        Movie movie_31 = new Movie();
        movie_31.setName("Great Ming Dynasty 1566");
        movie_31.setDescription("This is the story of the Ming emperor Jiajing and Hai Rui story. At that time, China's economy developed and its culture became prosperous. However, the social contradictions are prominent, and the State implements the plan of land annexation. A large number of peasants have lost their land. A traitor Yan Song caused dissatisfaction of local officials.Therefore, the activities of the overthrow of Yan Song broke out, and the palace was full of intrigue and struggle. loyal courtier and the treacherous have boarded the stage of history.");
        movie_31.setImdbUrl("https://www.imdb.com/title/tt6424870/");
        movie_31.setPosterFileUrl("/assets/imgs/greatmingdynasty.jpg");
        movie_31.setTags(Arrays.asList("history"));
        movie_31.setType("serial");

        Movie movie_32 = new Movie();
        movie_32.setName("Mad Max: Fury Road");
        movie_32.setDescription("In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper, and a drifter named Max.");
        movie_32.setImdbUrl("https://www.imdb.com/title/tt1392190/");
        movie_32.setPosterFileUrl("/assets/imgs/madmax.jpg");
        movie_32.setTags(Arrays.asList("sci-fi", "action"));
        movie_32.setType("movie");

        Movie movie_33 = new Movie();
        movie_33.setName("Speed");
        movie_33.setDescription("A young police officer must prevent a bomb exploding aboard a city bus by keeping its speed above 50 mph.");
        movie_33.setImdbUrl("https://www.imdb.com/title/tt0111257/");
        movie_33.setPosterFileUrl("/assets/imgs/speed.jpg");
        movie_33.setTags(Arrays.asList("action", "crime", "drama"));
        movie_33.setType("movie");

        List<Movie> movieList = Arrays.asList(
                movie_1, movie_2, movie_3, movie_4, movie_5,
                movie_6, movie_7, movie_8, movie_9, movie_10,
                movie_11, movie_12, movie_13, movie_14, movie_15,
                movie_16, movie_17, movie_18, movie_19, movie_20,
                movie_21, movie_22, movie_23, movie_24, movie_25,
                movie_26, movie_27, movie_28, movie_29, movie_30,
                movie_31, movie_32, movie_33
        );
        Collections.shuffle(movieList);
        return movieList;
    }


}
