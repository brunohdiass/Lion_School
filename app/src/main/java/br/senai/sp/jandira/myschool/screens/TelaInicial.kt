package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myschool.R

@Composable
fun TelaInicial() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // LOGO + NOME ESCOLA
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .width(130.dp)
                        .height(300.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = stringResource(R.string.lion_School),
                    fontSize = 40.sp,
                    color = colorResource(R.color.cor_logo)
                )
            }

            // TEXTOS E LINHA
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 15.dp)
            ) {
                Text(
                    text = stringResource(R.string.favorite_course),
                    fontSize = 23.sp,
                    color = colorResource(R.color.cor_logo),
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Card(
                    modifier = Modifier
                        .height(5.dp)
                        .width(70.dp),
                    colors = CardDefaults.cardColors(colorResource(R.color.dark_yellow))
                ) {}
                Spacer(modifier = Modifier.height(37.dp))
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.Center, // Centraliza verticalmente
                    horizontalAlignment = Alignment.CenterHorizontally // Centraliza horizontalmente
                ) {
                    Text(
                        text = "Get to your destination faster,study at ",
                        color = Color.Gray,
                        fontSize = 19.sp,
                        lineHeight = 24.sp
                    )
                    Text(
                        text = "the best vocational school in Brazil. Be",
                        color = Color.Gray,
                        fontSize = 19.sp,
                        lineHeight = 24.sp
                    )
                    Text(
                        text = "the best version of yourself.",
                        color = Color.Gray,
                        fontSize = 19.sp,
                        lineHeight = 24.sp
                    )
                }

            }

            Spacer(modifier = Modifier.height(150.dp))

            // BOTÃO
            Button(
                onClick = {},
                modifier = Modifier
                    .width(300.dp)
                    .height(45.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(R.color.Blue), // Substitua por sua cor azul
                        shape = RoundedCornerShape(15.dp)
                    ),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.dark_yellow)) // Cor de fundo amarela
            ) {
                Text(
                    text = stringResource(R.string.Get_Started),
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(80.dp))

            // REDES SOCIAIS
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = stringResource(R.string.youtube),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = stringResource(R.string.twitter),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = stringResource(R.string.instagram),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = stringResource(R.string.facebook),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}
