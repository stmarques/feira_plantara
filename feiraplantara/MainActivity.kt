package br.com.fiap.feiraplantara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.feiraplantara.ui.theme.FeiraPlantaraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeiraPlantaraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    FeiraPlantaraScreen()
                }
            }
        }
    }
}

@Composable
fun FeiraPlantaraScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))

//        Row(
//            modifier = Modifier
//                //.background(Color.Green)
//                .fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceAround
//
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    //.background(Color.Red)
//                    .clickable { }
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.brazilian_real),
//                    contentDescription = "Dinheiro em cédula",
//                    modifier = Modifier
//                        .size(50.dp)
//                        .padding(10.dp)
//                )
//                Text(text = "R$ 120", fontSize = 25.sp)
//                Spacer(modifier = Modifier.width(10.dp))
//                //Text(text = "Saldo", fontSize = 15.sp)
//                //Spacer(modifier = Modifier.width(10.dp))
//            }
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    //.background(Color.Cyan)
//                    .clickable { }
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.star),
//                    contentDescription = "Moeda de pontos",
//                    modifier = Modifier
//                        .size(50.dp)
//                        .padding(10.dp)
//                )
//                Text(text = "50", fontSize = 25.sp,)
//                Spacer(modifier = Modifier.width(10.dp))
//                Text(text = "Pontos", fontSize = 15.sp)
//                Spacer(modifier = Modifier.width(20.dp))
//            }
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                //.background(Color.Magenta)
//                //.clickable { }
//            ) {
//                Icon(
//                    imageVector = Icons.Default.FavoriteBorder,
//                    contentDescription = "Favoritos",
//                    modifier = Modifier.clickable { }
//                )
//                Spacer(modifier = Modifier.width(10.dp))
//                Icon(
//                    imageVector = Icons.Default.ShoppingCart,
//                    contentDescription = "Carrinho",
//                    modifier = Modifier.clickable { }
//                )
//                Spacer(modifier = Modifier.width(10.dp))
//            }
//
//        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                //.background(Color.Magenta)
                .fillMaxWidth()
                .height(200.dp)
        ) {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.banner_farm_to_table,),
                        contentDescription = "Banner: encontre orgânicos farm to table perto de você",
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(30.dp))
                            .clickable { }

                    )
                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.banner_pancs),
                        contentDescription = "Banner: PANCS - Plantas Alimentícias Não Convencionais",
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(30.dp))
                            .clickable { }
                    )
                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.banner_mudas_de_plantas),
                        contentDescription = "Banner: encontre mudas de plantas",
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(30.dp))
                            .clickable { }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            //modifier = Modifier.background(Color.Gray)
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.Gray)
            ) {
                Text(
                    text = "Categorias",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.Magenta)
            ) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Ver tudo",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.Yellow)
            ) {

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_vegetais),
                                        contentDescription = "Botão de vegetais",
                                        modifier = Modifier
                                            .size(60.dp)
                                    )
                                }
                                Row {
                                    Text(
                                        text = "Vegetais",
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_frutas),
                                        contentDescription = "Botão de frutas",
                                        modifier = Modifier
                                            .size(60.dp)
                                    )
                                }
                                Row {
                                    Text(
                                        text = "Frutas",
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_graos),
                                        contentDescription = "Botão de grãos",
                                        modifier = Modifier
                                            .size(60.dp)
                                    )
                                }
                                Row {
                                    Text(
                                        text = "Grãos",
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_panc),
                                        contentDescription = "Botão de pancs",
                                        modifier = Modifier
                                            .size(60.dp)
                                    )
                                }
                                Row {
                                    Text(
                                        text = "PANCS",
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_sementes),
                                        contentDescription = "Botão de sementes",
                                        modifier = Modifier
                                            .size(60.dp)
                                    )
                                }
                                Row {
                                    Text(
                                        text = "Sementes",
                                        fontSize = 20.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        Column {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    //.background(Color.Green)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Itens mais procurados",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    //.background(Color.Red)
                    .fillMaxWidth()
            ) {
                TextButton(onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Ver tudo",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                }
            }
            Row(
                modifier = Modifier
                    //.background(Color.Magenta)
                    .fillMaxWidth()
            ) {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            shape = RectangleShape,
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.item_cenoura),
                                        contentDescription = "Botão da cenoura",
                                        modifier = Modifier
                                            .size(150.dp)
                                    )
                                }
                                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                                    Text(
                                        text = "Cenoura",
                                        fontSize = 25.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            shape = RectangleShape,
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.item_hortela),
                                        contentDescription = "Botão da hortelã",
                                        modifier = Modifier
                                            .size(150.dp)
                                    )
                                }
                                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                                    Text(
                                        text = "Hortelã",
                                        fontSize = 25.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            shape = RectangleShape,
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.item_limao),
                                        contentDescription = "Botão do limão",
                                        modifier = Modifier
                                            .size(150.dp)
                                    )
                                }
                                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                                    Text(
                                        text = "Limão",
                                        fontSize = 25.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            shape = RectangleShape,
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.item_louro),
                                        contentDescription = "Botão da folha de louro",
                                        modifier = Modifier
                                            .size(150.dp)
                                    )
                                }
                                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                                    Text(
                                        text = "Folha de louro",
                                        fontSize = 25.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            shape = RectangleShape,
                        ) {
                            Column {
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.item_tomate),
                                        contentDescription = "Botão do tomate",
                                        modifier = Modifier
                                            .size(150.dp)
                                    )
                                }
                                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                                    Text(
                                        text = "Tomate",
                                        fontSize = 25.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun FeiraPlantaraPreview() {
    FeiraPlantaraTheme {

    }
}