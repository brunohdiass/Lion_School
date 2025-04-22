package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myschool.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaTerciaria() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        // LOGO E CABEÇALHO
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(60.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = "Lion\nSchool",
                fontSize = 20.sp,
                color = Color(0xFF2A2D8E),
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color(0xFFFFC700), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "DS",
                    color = Color(0xFF2A2D8E),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(Modifier.height(16.dp))
        HorizontalDivider(color = Color(0xFFFFC700), thickness = 2.dp)
        Spacer(Modifier.height(16.dp))

        // CAMPO DE BUSCA
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Find a student") },
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(12.dp))
                .border(1.dp, Color(0xFFFFC700), RoundedCornerShape(12.dp)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color(0xFFF0F0F0),
                focusedBorderColor = Color(0xFFFFC700),
                unfocusedBorderColor = Color(0xFFFFC700)
            ),
            shape = RoundedCornerShape(12.dp),
            singleLine = true
        )

        Spacer(Modifier.height(16.dp))

        // FILTROS
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            listOf(
                Triple("Todos", Color(0xFF2A2D8E), Color.White),
                Triple("Cursando", Color(0xFFFFC700), Color(0xFF2A2D8E)),
                Triple("Finalizado", Color(0xFFFFC700), Color(0xFF2A2D8E))
            ).forEach { (label, bg, textColor) ->
                Box(
                    modifier = Modifier
                        .background(bg, shape = RoundedCornerShape(32.dp))
                        .padding(horizontal = 24.dp, vertical = 8.dp)
                ) {
                    Text(text = label, color = textColor)
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // TÍTULO
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.graduation),
                contentDescription = "Graduação",
                modifier = Modifier
                    .size(60.dp)       // Tamanho maior
                    .padding(end = 8.dp), // Espaçamento à direita, se estiver antes de um texto
                tint = Color(0xFF3F51B5)
            )

            Spacer(Modifier.width(8.dp))
            Text(
                text = "Students List",
                fontSize = 24.sp,
                color = Color(0xFF2A2D8E),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.height(16.dp))

        // CARD 1
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Luana Oliveira Dias",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20151001018", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color(0xFFFFC700)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2022", color = Color(0xFFFFC700), fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 2
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Carlos Eduardo Martins",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20141001022", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2024", color = Color.White, fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 3
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar3),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Fernanda Souza Lima",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20161002055", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color(0xFFFFC700)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2022", color = Color(0xFFFFC700), fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 4
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar4),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "João Pedro Silveira",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20181003033", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2024", color = Color.White, fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 5
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar5),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Amanda Cristina Ramos",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20121004011", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color(0xFFFFC700)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2022", color = Color(0xFFFFC700), fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 6
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar7),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Bruno Henrique Souza",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20111005099", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2023", color = Color.White, fontSize = 14.sp)
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // CARD 7
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFADB4E0)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar7),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)      // ← desloca para direita
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .padding(2.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Patrícia Alves Barbosa",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ra_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(text = "20121006045", color = Color.White, fontSize = 12.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "2023", color = Color.White, fontSize = 14.sp)
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaTerciariaPreview() {
    TelaTerciaria()
}
