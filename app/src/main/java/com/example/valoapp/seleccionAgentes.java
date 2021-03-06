package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;

import com.google.gson.Gson;

import java.io.Serializable;

public class seleccionAgentes extends AppCompatActivity {

    ImageButton astra, breach, brimstone, chamber, cypher, jett, kayo, killjoy, neon, omen, phoenix, raze, reyna, sage, sky, sova, viper, yoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_agentes);
        //definir Botones
        astra = (ImageButton) this.findViewById(R.id.btnAstra);
        breach = (ImageButton) this.findViewById(R.id.btnBreach);
        brimstone = (ImageButton) this.findViewById(R.id.btnBrimstone);
        chamber = (ImageButton) this.findViewById(R.id.btnChamber);
        cypher = (ImageButton) this.findViewById(R.id.btnCyper);
        jett = (ImageButton) this.findViewById(R.id.btnJett);
        kayo = (ImageButton) this.findViewById(R.id.btnKayo);
        killjoy = (ImageButton) this.findViewById(R.id.btnKilljoy);
        neon = (ImageButton) this.findViewById(R.id.btnNeon);
        omen = (ImageButton) this.findViewById(R.id.btnOmen);
        phoenix = (ImageButton) this.findViewById(R.id.btnPhoenix);
        raze = (ImageButton) this.findViewById(R.id.btnRaze);
        reyna = (ImageButton) this.findViewById(R.id.btnReyna);
        sage = (ImageButton) this.findViewById(R.id.btnSage);
        sky = (ImageButton) this.findViewById(R.id.btnSky);
        sova = (ImageButton) this.findViewById(R.id.btnSova);
        viper = (ImageButton) this.findViewById(R.id.btnViper);
        yoru = (ImageButton) this.findViewById(R.id.btnYoru);





       //Definir Clases de cada Agente
        Agente jettAgent = new Agente("Jett", "duelista", "Corea del Sur", "jettf",
                "jett", "hjett1", "hjett2", "hjett3",
                "hjett4", "Propulsa a Jett hacia el aire AL INSTANTE.", "Propulsa AL INSTANTE a Jett hacia la direcci??n a la que se dirige. Si no se est?? moviendo, se propulsar?? hacia adelante.","Lanza un proyectil AL INSTANTE que se convierte en una nube que bloquea la visi??n al impactar alguna superficie. MANT??N PRESIONADA la tecla de la habilidad para cambiar la trayectoria del humo hacia donde apuntes.",
                "EQUIPA un conjunto de cuchillos de gran precisi??n que se recargan al asesinar a un oponente. DISPARA para lanzar un cuchillo hacia tu objetivo y usa el DISPARO SECUNDARIO para lanzar todos los cuchillos restantes.", "Es imparable en todos los enfrentamientos y acaba con sus enemigos antes de que sepan qu?? los atac??.", "xU2U73Tk-DM","operator","mjett");

        Agente razeAgent = new Agente("Raze", "duelista", "Brasil", "razef",
                "raze", "hraze1", "hraze2", "hraze3",
                "hraze4", "Lanza AL INSTANTE un Paquete Explosivo que se adhiere a las superficies. VUELVE A USAR la habilidad despu??s de desplegar el paquete para detonarlo, lo que da??ar?? y desplazar?? todo a su alcance. ", "EQUIPA una granada de racimo y DISPARA para lanzarla. La granada infligir?? da??o por su cuenta y crear?? submuniciones que tambi??n infligir??n da??o a cualquiera que se encuentre dentro de su alcance.","EQUIPA un Bumbot y DISPARA para desplegarlo. El bot se mover?? en l??nea recta por el suelo y rebotar?? en los muros. El Bumbot marcar?? a cualquier enemigo que se encuentre en un cono frente a ??l y lo perseguir??. Si lo alcanza, explotar?? e infligir?? da??o masivo.",
                "EQUIPA un lanzamisiles. DISPARA para lanzar un misil que inflige da??o de ??rea masivo al entrar en contacto con algo.", "Gracias a su contundente estilo de juego, es muy buena para separar los enemigos atrincherados y para despejar espacios estrechos con una gran cantidad de explosiones.", "_gzztoO3YmE","judge","mraze");

        Agente breachAgent = new Agente("Breach", "iniciador", "Suecia", "breachf",
                "breach", "hbreach1", "hbreach2", "hbreach3",
                "hbreach4", "EQUIPA una carga cegadora y DISPARA para lanzar una r??faga de acci??n r??pida a trav??s de una pared. La carga detonar?? y cegar?? a todos los jugadores que la vean.", "EQUIPA un rayo s??smico y MANT??N PRESIONADO EL BOT??N DE DISPARO para aumentar la distancia. SU??LTALO para iniciar el temblor y aturdir a todos los jugadores que est??n en la zona.","EQUIPA una carga de fusi??n y DISPARA para lanzar una r??faga de acci??n lenta a trav??s de una pared. La r??faga infligir?? da??o masivo a todos los que est??n en su alcance",
                "EQUIPA una carga s??smica y DISPARA para enviar un temblor en cascada por una gran zona c??nica. El temblor aturde y lanza por el aire a todos los que impacta.", "El da??o y la interrupci??n que inflige garantizar??n que ninguna pelea sea justa.", "Rux0HjzKQbw","bulldog","mbreach");

        Agente omenAgent = new Agente("Omen", "controlador", "Memoria", "omenf",
                "omen", "homen1", "homen2", "homen3",
                "homen4", "Lanza un proyectil de sombras que reduce el alcance de visi??n de todos los jugadores a los que alcanza durante un breve periodo. Este proyectil puede atravesar paredes.", "EQUIPA un orbe de sombras y mira su indicador de alcance. DISPARA para lanzarlo hacia la ubicaci??n marcada. El orbe crear?? una esfera de sombras de larga duraci??n que bloquea la visi??n. MANT??N PRESIONADO EL BOT??N DE DISPARO SECUNDARIO mientras apuntas para alejar el marcador. MANT??N PRESIONADA la tecla de la habilidad mientras apuntas para acercar el marcador.","EQUIPA la habilidad Paso Sombr??o y mira su indicador de alcance. DISPARA para comenzar una breve canalizaci??n y luego teletransp??rtate hacia la ubicaci??n marcada.",
                "EQUIPA un mapa estrat??gico. DISPARA para empezar a teletransportarte hacia la ubicaci??n seleccionada. Mientras te teletransportas, Omen lucir?? como una sombra que los enemigos podr??n destruir para cancelar su teletransportaci??n.", "Un espectro de la memoria, Omen caza entre las sombras, ciega a los enemigos, se transporta a trav??s del campo de batalla y deja que la paranoia los invada mientras intentan descubrir d??nde atacar??.", "jJdWy6bDj4","ares","momen");

        Agente brimstoneAgent = new Agente("Brimstone", "controlador", "Estados Unidos", "brimstonef",
                "brimstone", "hbrimstone1", "hbrimstone2", "hbrimstone3",
                "hbrimstone4", "EQUIPA un lanzagranadas incendiario y DISPARA para lanzar una granada que explota cuando se detiene en el suelo. Esta crea una zona de fuego que permanece en el campo y da??a a los enemigos que est??n dentro de ella.", "EQUIPA un mapa estrat??gico y DISPARA para marcar las ubicaciones en las que caer??n las nubes de humo de Brimstone. Usa el DISPARO SECUNDARIO para confirmar y lanzar nubes de humo de larga duraci??n que bloquear??n la visi??n en la zona seleccionada.","EQUIPA una baliza potenciadora y DISPARA para lanzarla frente a Brimstone. Al caer, Resguardo Potenciador crear?? un campo que aumenta la velocidad de disparo de los jugadores.",
                "EQUIPA un mapa estrat??gico y DISPARA para lanzar un ataque orbital prolongado de un l??ser en la ubicaci??n seleccionada. Este infligir?? da??o masivo con el tiempo a los jugadores que est??n en la zona.", " Su habilidad otorga informaci??n de forma precisa y a distancia, lo que lo hace un comandante sin igual en el campo.", "7yHnJ_oNxTI","bucky","mbrimstone");

        Agente phoenixAgent = new Agente("Phoenix", "duelista", "Reino Unido", "phoenixf",
                "phoenix", "hphoenix1", "hphoenix2", "hphoenix3",
                "hphoenix4", "EQUIPA un orbe cegador que recorre una trayectoria curva y detona poco despu??s de lanzarlo. DISPARA para cambiar la trayectoria del orbe cegador hacia la izquierda. Este detonar?? y cegar?? a cualquier jugador que lo vea. Usa el DISPARO SECUNDARIO para cambiar su trayectoria hacia la derecha.", "EQUIPA una bola de fuego y DISPARA para lanzarla. Esta explotar?? tras cierto tiempo o al impactar el suelo, lo que crear?? una zona de fuego que permanecer?? en el campo y da??ar?? a los enemigos.","EQUIPA un muro de fuego y DISPARA para crear una hilera de llamas que avanza, lo que crear?? un muro que bloquea la visi??n y da??ar?? a los jugadores que lo atraviesen. MANT??N PRESIONADO EL BOT??N DE DISPARO para mover el muro en la direcci??n de tu ret??cula.",
                "Coloca al INSTANTE un marcador en la ubicaci??n de Phoenix. Cuando esta habilidad est?? activa, morir o dejar que el temporizador expire har?? que la habilidad se termine y regresar?? a Phoenix a esa ubicaci??n con toda su vida.", " El poder estelar de Phoenix se manifiesta en su estilo de combate al incendiar el campo de batalla con sus granadas aturdidoras y cegadoras. Sin importar si cuenta con apoyo o no, participar?? en la batalla bajo sus propios t??rminos.", "ttJMFW2wUQM","phantom","mphoenix");

        Agente sageAgent = new Agente("Sage", "centinela", "China", "sagef",
                "sage", "hsage1", "hsage2", "hsage3",
                "hsage4", "EQUIPA un orbe de ralentizaci??n y DISPARA para lanzarlo. Este detonar?? al caer al suelo y crear?? un campo que permanecer?? en la zona y ralentizar?? a los jugadores que est??n dentro de ??l.", "EQUIPA un orbe curativo y DISPARA tras apuntar a un aliado herido para curarlo con el tiempo. Usa el DISPARO SECUNDARIO cuando Sage est?? herida para curarla con el tiempo.","EQUIPA un orbe de barrera. DISPARA para colocar una pared s??lida. Usa el DISPARO SECUNDARIO para rotarla antes de crearla.",
                "EQUIPA una habilidad de resurrecci??n y DISPARA mientras apuntas hacia un aliado muerto para comenzar a resucitarlo. Tras un breve periodo de canalizaci??n, el aliado revivir?? con toda su vida.", "Gracias a su capacidad de revivir a sus compa??eros ca??dos y evitar ataques agresivos, les da un lugar de protecci??n en medio de la ca??tica pelea.", "1aRwM_QsqQI","spectre","msage");

        Agente sovaAgent = new Agente("Sova", "iniciador", "Rusia", "sovaf",
                "sova", "hsova1", "hsova2", "hsova3",
                "hsova4", "EQUIPA un arco con un proyectil el??ctrico y DISPARA para lanzarlo. El proyectil detonar?? al impactar y da??ar?? a los jugadores cercanos. MANT??N PRESIONADO EL BOT??N DE DISPARO para aumentar el alcance del proyectil. Usa el DISPARO SECUNDARIO para a??adir hasta dos rebotes a su trayectoria", "EQUIPA un arco con un proyectil rastreador y DISPARA para lanzarlo. El proyectil se activar?? al impactar y revelar?? la ubicaci??n de los enemigos cercanos que est??n dentro de su alcance. MANT??N PRESIONADO EL BOT??N DE DISPARO para aumentar el alcance del proyectil. Usa el DISPARO SECUNDARIO para a??adir hasta dos rebotes a la trayectoria de la flecha","EQUIPA un dron b??ho y DISPARA para desplegarlo y controlar su movimiento. Mientras lo controlas, DISPARA para lanzar un dardo marcador que revelar?? la ubicaci??n de cualquier jugador al que impacte.",
                "EQUIPA un arco con tres r??fagas de energ??a de largo alcance que atraviesan las paredes. DISPARA para lanzar una r??faga de energ??a frente a Sova que infligir?? da??o y revelar?? la ubicaci??n de los enemigos impactados. Puedes VOLVER A USAR esta habilidad hasta dos veces m??s mientras su contador est?? activo.", "Su arco personalizado y sus incre??bles habilidades de exploraci??n impedir??n que sus enemigos puedan esconderse de ??l.", "OZ76UP-c8Ao","marshal","msova");

        Agente viperAgent = new Agente("Viper", "controlador", "Estados Unidos", "viperf",
                "viper", "hviper1", "hviper2", "hviper3",
                "hviper4", "EQUIPA un emisor de gas y DISPARA para lanzarlo. Este permanecer?? ah?? durante toda la ronda. VUELVE A USAR la habilidad para crear una nube de gas t??xica que usa combustible. Puedes VOLVER A USAR esta habilidad varias veces y puedes recuperarla para VOLVER A DESPLEGARLA.", "EQUIPA un lanzador de gas y DISPARA para desplegar una larga hilera de emisores de gas. VUELVE A USAR la habilidad para crear un muro de gas t??xico que usa combustible. Puedes VOLVER A USAR esta habilidad varias veces.","EQUIPA un lanzador de qu??micos. DISPARA para lanzar un contenedor que se rompe al impactar contra el suelo. Este crea una zona qu??mica que permanece en el campo, la cual da??a y ralentiza a los enemigos.",
                "EQUIPA un rociador y DISPARA para lanzar una nube de qu??micos en todas las direcciones alrededor de Viper, lo que crea una gran nube que reduce el alcance de visi??n y la vida m??xima de los jugadores que est??n dentro de ella.", " Si las toxinas no asesinan a su presa, sin duda lo har??n sus juegos mentales.", "9dOSy0EhLfQ","phantom","mviper");

        Agente cypherAgent = new Agente("Cypher", "centinela", "Marruecos", "cypherf",
                "cypher", "hcypher1", "hcypher2", "hcypher3",
                "hcypher4", "Lanza AL INSTANTE una ciberjaula frente a Cypher. Act??vala para crear una zona que bloquea la visi??n y ralentiza a los enemigos que la atraviesan.", "EQUIPA una c??mara esp??a. DISPARA para colocarla en la ubicaci??n seleccionada. VUELVE A USAR esta habilidad para tomar el control de la vista de la c??mara. Mientras la controlas, DISPARA para lanzar un dardo marcador que revelar?? la ubicaci??n de cualquier jugador al que impacte.","EQUIPA un cable trampa. DISPARA para colocar un cable trampa destructible y camuflado en la ubicaci??n seleccionada que crear?? una l??nea entre ese lugar y la pared opuesta. Los jugadores enemigos que activen el cable trampa quedar??n atados, revelados y aturdidos tras un momento si no destruyen el dispositivo a tiempo. Puedes recogerlo y VOLVER A COLOCARLO.",
                "Apunta hacia un jugador enemigo muerto y ??salo DE INMEDIATO para revelar la ubicaci??n de todos los jugadores enemigos con vida.","No hay secreto que no descubra ni maniobra que no detecte. Cypher siempre est?? vigilando.", "SgbqFtRRgLA","phantom","mcypher");

        Agente reynaAgent = new Agente("Reyna", "duelista", "Mexico", "reynaf",
                "reyna", "hreyna1", "hreyna2", "hreyna3",
                "hreyna4", "Los enemigos eliminados por Reyna dejan orbes de almas que duran 3 seg. Consume al INSTANTE un orbe de almas cercano y la cura r??pidamente durante un breve momento. La Vida superior a 100 que obtenga mediante esta habilidad se deteriorar?? con el tiempo. Si LA EMPERATRIZ est?? activa, lanzar?? autom??ticamente esta habilidad sin consumir el orbe.", "Consume al INSTANTE un orbe de almas cercano para volverse intangible durante un breve momento. Tambi??n se vuelve invisible si LA EMPERATRIZ est?? activa.","EQUIPA un ojo destructible y et??reo. ACT??VALO para lanzarlo a una corta distancia y todos los enemigos que lo vean se ofuscar??n.",
                "Entra al INSTANTE en un frenes??, lo que aumenta considerablemente la velocidad de disparo, equipamiento y recarga. Al lograr un asesinato, se restablece la duraci??n.", " Su letalidad solo est?? limitada por tu destreza al usarla, por lo que su eficacia depender?? mucho de ello.", "IzsQNYrq9AM","vandal","mreyna");

        Agente killjoyAgent = new Agente("Killjoy", "centinela", "Alemania", "killjoyf",
                "killjoy", "hkilljoy1", "hkilljoy2", "hkilljoy3",
                "hkilljoy4", "EQUIPA un Alarmabot encubierto. DISPARA para desplegar un bot que caza a los enemigos que entren en su alcance. Despu??s de alcanzar a su objetivo, el bot explota, lo que inflige da??o y aplica Vulnerable. MANT??N PRESIONADO EQUIPAR para recuperar un bot desplegado.", "EQUIPA una Torreta. DISPARA para desplegar una torreta que les dispara a los enemigos cercanos en un cono de 180 grados. MANT??N PRESIONADO EQUIPAR para recuperar una torreta desplegada.","EQUIPA una granada de Nanoplaga. DISPARA para lanzar la granada. La Nanoplaga queda encubierta al aterrizar. ACTIVA Nanoplaga para desplegar un mortal enjambre de nanobots.",
                "EQUIPA el Dispositivo Inmovilizador. DISPARA para desplegar el dispositivo. Tras cargar, el dispositivo detiene a todos los enemigos dentro de su radio. Los enemigos pueden destruir el dispositivo.", "Si el da??o que inflige su equipamiento no detiene a sus enemigos, la debilitaci??n de sus robots la ayudar??n a aniquilarlos.", "ckKA_A1xC_0","vandal"," ");

        Agente skyeAgent = new Agente("Skye", "iniciador", "Australia", "skyef",
                "sky", "hskye1", "hskye2", "hskye3",
                "hskye4", "TE EQUIPAS un artefacto de tigre de Tasmania. DISPARA para enviar y tomar el control del depredador. Mientras lo controlas, DISPARA para saltar hacia adelante, lo que provoca una explosi??n contusiva e inflige da??o a los enemigos alcanzados directamente.", "TE EQUIPAS un artefacto de halc??n. DISPARA para enviarlo hacia adelante. MANT??N PRESIONADO EL DISPARO para guiar al halc??n en la direcci??n de tu ret??cula. REUTIL??ZALA mientras el halc??n est?? en vuelo para transformarlo en un destello que lanza un sonido de confirmaci??n si un enemigo estaba dentro del alcance y campo visual.","TE EQUIPAS un artefacto de curaci??n. MANT??N PRESIONADO EL DISPARO para canalizar, lo que cura aliados dentro del alcance y campo visual. Se puede reutilizar hasta que se agote la energ??a de curaci??n. Skye no puede curarse a s?? misma.",
                "TE EQUIPAS un artefacto de buscador. DISPARA para enviar tres buscadores a rastrear a los tres enemigos m??s cercanos. Si un buscador alcanza su objetivo, lo ofusca.", "Con sus creaciones que obstaculizan al enemigo y su poder para sanar a los dem??s, los equipos ser??n m??s fuertes y seguros al lado de Skye.", "s7sAeO3-T-8","guardian"," ");

        Agente yoruAgent = new Agente("Yoru", "duelista", "Japon", "yoruf",
                "yoru", "hyoru1", "hyoru2", "hyoru3",
                "hyoru4", "EQU??PALO para arrancar un fragmento dimensional inestable de la realidad. DISPARA para lanzar el fragmento, lo que activa un destello que termina una vez que choca con una superficie dura en el mundo", "EQU??PALO para usar un v??nculo dimensional. DISPARA para lanzar el v??nculo. Usa el DISPARO SECUNDARIO para colocar un v??nculo en el lugar. ACT??VALO para teletransportarte a la ubicaci??n del v??nculo.","EQUIPA un eco que imita el sonido de pisadas cuando se activa. DISPARA para activarlo y enviar el eco hacia adelante. Usa el DISPARO SECUNDARIO para colocar un eco en el lugar. USA el eco inactivo para enviarlo hacia adelante.",
                "EQUIPA una m??scara que puede ver entre dimensiones. DISPARA para viajar hacia la dimensi??n de Yoru, donde los enemigos no pueden afectarlo o verlo desde el exterior", "Con enga??os y agresividad por igual, sorprende a sus objetivos antes de que sepan d??nde buscarlo.", "c_-y7aY89ss","stinger"," ");

        Agente astraAgent = new Agente("Astra", "controlador", "Ghana", "astraf",
                "astra", "hastra1", "hastra2", "hastra3",
                "hastra4", "Coloca estrellas en Modo Astral (X) ACTIVA una estrella para detonar un Pulso Estelar. El Pulso Estelar carga brevemente y luego ataca, lo que aturde a todos los jugadores en el ??rea.", "Coloca estrellas en Modo Astral (X) ACTIVA una estrella para transformarla en una Nebulosa (humo). Usa (F) en una estrella para Disiparla, lo que devuelve la estrella para colocarla en una nueva ubicaci??n despu??s de un momento. Disipar forma una Nebulosa falsa brevemente en la ubicaci??n de la estrella antes de regresar.","Coloca estrellas en Modo Astral (X) ACTIVA una estrella para formar un Pozo Gravitacional. Los jugadores en el ??rea son atra??dos hacia el centro antes de que estalle, lo que causa que todos los jugadores que a??n siguen atrapados se vuelvan fr??giles.",
                "CTIVA (X) para entrar en Modo Astral donde puedes colocar estrellas con tu DISPARO PRINCIPAL. Puedes reactivar las estrellas m??s tarde, lo que las transforma en un Pulso Estelar, Nebulosa o Pozo Gravitacional. Cuando Divisi??n C??smica est?? cargada, usa el DISPARO SECUNDARIO en Modo Astral para comenzar a apuntar, luego el DISPARO PRINCIPAL para elegir dos ubicaciones. Una Divisi??n C??smica infinita conecta los dos puntos que selecciones. Divisi??n C??smica bloquea las balas y amortigua considerablemente el audio.", "Con pleno dominio de su forma astral y un talento para una profunda previsi??n estrat??gica, siempre est?? eones por delante del pr??ximo movimiento de su enemigo.", "n7l-m4IBPsI","sheriff"," ");

        Agente kayoAgent = new Agente("Kay/o", "iniciador", "Maquina", "kayof",
                "kayo", "hkayo1", "hkayo2", "hkayo3",
                "hkayo4", "EQUIPA una granada cegadora. DISPARA para lanzarla. La granada cegadora explota despu??s de un breve tiempo y ciega a todos en la l??nea de visi??n.", "EQUIPA una cuchilla de supresi??n. DISPARA para lanzarla. La cuchilla se pega contra la primera superficie que toca, luego explota y suprime a cualquier oponente que se encuentre en el radio de la explosi??n.","EQUIPA un fragmento explosivo. DISPARA para lanzarlo. El fragmento se pega al piso y explota varias veces, lo que inflige da??o casi mortal en el centro con cada explosi??n.",
                "Se sobrecarga AL INSTANTE con energ??a de radianita polarizada que le da poder a KAY/O y causa que grandes pulsos de energ??a emanen desde su ubicaci??n. Los enemigos impactados por dichos pulsos quedan suprimidos durante un breve momento.", " Su poder para suprimir las habilidades enemigas neutraliza la capacidad de sus rivales para contraatacar, un aspecto que le da a ??l y a sus aliados la ventaja definitiva en la batalla.", "AUfDJAn3Upw","judge"," ");


        Agente chamberAgent = new Agente("Chamber", "centinela", "Frances", "chamberf",
                "chamber", "hchamber1", "hchamber2", "hchamber3",
                "hchamber4", "ACT??VALA para equipar una pistola pesada. Presiona DISPARO SECUNDARIO con la pistola equipada para usar la mira.", "COLOCA dos teletransportadores. Mientras est??s en el suelo y dentro de su zona de alcance, podr??s REACTIVAR la habilidad para transportarte r??pidamente al otro teletransportador. Puedes recogerlos para VOLVER A COLOCARLOS en otro lugar.","COLOCA una trampa que escanea los alrededores buscando enemigos. Cuando un enemigo visible entra en contacto, esta comienza una cuenta regresiva que, al terminar, desestabiliza el terreno a su alrededor y crea un ??rea que permanece en la zona y ralentiza a los enemigos dentro de ella.",
                "ACT??VALA para invocar un poderoso rifle de francotirador personalizado que mata a cualquier enemigo al que impacte directamente. Matar a un enemigo crea un ??rea que permanece en la zona y ralentiza a los jugadores que queden dentro de ella.", "Es un papucho bien vestido y bien armado, el dise??ador de armas franc??s Chamber repele agresores con una precisi??n mortal. ", "Xusqu73dxRM","operator"," ");

        Agente neonAgent = new Agente("Neon", "duelista", "Filipinas", "neonf",
                "neon", "hneon1", "hneon2", "hneon3",
                "hneon4", "Lanza un rayo de energ??a INSTANT??NEO que rebota una vez. Luego de golpear cada superficie, el rayo electrifica el terreno debajo, lo que provoca una explosi??n conmocionante.", "Canaliza INSTANT??NEAMENTE el poder de Neon para aumentar su velocidad. Al cargarse, utiliza el DISPARO SECUNDARIO para activar un deslizamiento el??ctrico. La carga del deslizamiento se reinicia cada dos asesinatos.","DISPARA dos l??neas de energ??a hacia adelante por el suelo que se extienden por una corta distancia o hasta golpear contra una superficie. Las l??neas se convierten en paredes de electricidad est??tica que bloquean la visi??n y da??an a cualquier enemigo que quiera atravesarlas.",
                "Desata todo el poder y la velocidad de Neon por un tiempo corto. DISPARA para canalizar todo su poder en un rayo mortal con gran precisi??n de movimiento. La duraci??n se reinicia con cada asesinato.", "Se adelanta velozmente a sus enemigos para atraparlos desprevenidos y luego los fulmina m??s r??pido que un rayo.", "yW4fqAhETp8","phantom"," ");








        astra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(astraAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(breachAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        brimstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(brimstoneAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        chamber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(chamberAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(cypherAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(jettAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        kayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(kayoAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        killjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(killjoyAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(neonAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(omenAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(phoenixAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(razeAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(reynaAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(sageAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(skyeAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(sovaAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(viperAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        yoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(yoruAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });
    }
}