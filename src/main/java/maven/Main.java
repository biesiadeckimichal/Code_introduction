// package maven;
//
// import com.github.fedy2.weather.YahooWeatherService;
// import com.github.fedy2.weather.data.Channel;
// import com.github.fedy2.weather.data.unit.DegreeUnit;
//
// import javax.xml.bind.JAXBException;
// import java.io.IOException;
//
// public class Main {
//     // maven domyslnie dziala dla java do version 5, aby uzyc funkcjonalnosci
//     // np javy 8 jak strumienie, musimy dodac taka funkcjonalnosc, najlatwiej jest
//     // wygooglowac i dodac do zakladki m maven...
//     //    <properties>
//     //        <maven.compiler.target>1.8</maven.compiler.target>
//     //        <maven.compiler.source>1.8</maven.compiler.source>
//     //    </properties>
//     // uzalezniamy nasz projekt przez dependecies od jakies biblioteki apache
//     // zakladka m maven...
//
//     public static void main(String[] args) throws JAXBException, IOException {
//         System.out.println("hello");
//
//         YahooWeatherService yahooWeatherService = new YahooWeatherService();
//         Channel channel = yahooWeatherService.getForecast("498842", DegreeUnit.CELSIUS);
//         System.out.println(channel.getTitle());
//
//     }
// }
