package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwMEnsaje;
    final String sMostrar = "El Club de Fútbol América S. A. de C. V. es un equipo de fútbol profesional de la Primera División de México. Fundado el 12 de octubre de 1916 en la Ciudad de México. El club disputa sus partidos como local en el Estadio Azteca y sus colores tradicionales son el amarillo y el azul.\n" +
            "\n" +
            "Es la institución con el mayor número de campeonatos en todo tipo de competencias oficiales entre los clubes del fútbol mexicano, sumando un total de 40 (30 nacionales y 10 internacionales).7\u200B\n" +
            "\n" +
            "Ostenta el primer lugar en campeonatos de liga de Primera División con 17 títulos ganados. Al mismo tiempo, ocupa la primera posición en la lista de clubes con más títulos nacionales en México con treinta (diecisiete de Liga, siete de Copa México — máximo ganador — y seis de Campeón de Campeones).8\u200B9\u200B Es el único equipo que ha participado en todas las temporadas de Liga, desde 1922-23.\n" +
            "\n" +
            "Su trayectoria de 27 participaciones en torneos internacionales, representa la cifra más alta para cualquier equipo mexicano; con ello además, logra distinguirse como el club mexicano, y en consecuencia la escuadra perteneciente a la Concacaf, que acumula el mayor número de títulos internacionales con diez en total: siete en la Liga de Campeones de la Concacaf, uno de la Copa de Gigantes de la Concacaf y dos de Copa Interamericana.10\u200B A su vez, ocupa el puesto 14 a nivel mundial en cuanto a más títulos internacionales ganados.11\u200B\n" +
            "\n" +
            "Es el equipo más popular de México delante de su tradicional rival, el Club Deportivo Guadalajara, según las recientes encuestas realizadas por Grupo Reforma y Consulta Mitofsky, desde el año 2013 al 2017, y nuevamente en 2019.12\u200B13\u200B El América también tiene la particularidad de ser el equipo que genera más animadversión para la afición del país.14\u200B\n" +
            "\n" +
            "Fue el primer equipo no europeo o sudamericano en ser Club Mundial del Mes en agosto del 2001, y uno de los dos clubes en serlo dos veces junto al Al-Ahly de Egipto en agosto de 2001 y mayo de 2002.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMEnsaje = findViewById(R.id.txtVwMEnsaje);
        txtVwMEnsaje.setText(sMostrar);
    }
}
