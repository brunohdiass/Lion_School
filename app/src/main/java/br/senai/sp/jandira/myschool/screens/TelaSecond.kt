package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaSecond() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            // LOGO + NOME ESCOLA
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .width(65.dp)
                        .height(65.dp)
                )

                Spacer(modifier = Modifier.width(1.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = stringResource(R.string.lion_nSchool),
                        fontSize = 16.sp,
                        color = colorResource(R.color.cor_logo)
                    )
                }
            }

            // LINHA AMARELA
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.dark_yellow))
            ) {}

            // BARRA DE BUSCA
            // BARRA DE BUSCA
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Find your course") },
                trailingIcon = {
                    Icon(Icons.Default.Search, contentDescription = "Search Icon")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(56.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)), // Borda amarela
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFFF0F0F0), // Fundo cinza claro
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )


            // TÍTULO "Courses"
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "List Icon",
                    tint = colorResource(R.color.dark_yellow)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Courses",
                    fontSize = 24.sp,
                    color = Color(0xFF1C1C1C)
                )
            }

            // CURSO 1 - DS
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)) // Borda amarela
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ds),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = "DS", fontSize = 75.sp, color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Desenvolvimento de Sistemas", color = Color.White, fontSize = 16.sp)
                        Text(text = "Learn to develop web and mobile applications.", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(7.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "3 semesters", color = Color.White, fontSize = 12.sp)
                        }
                    }
                }
            }

            // CURSO 2 - RDS
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)) // Borda amarela
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.rds),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = "RDS", fontSize = 75.sp, color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Redes de Computadores", color = Color.White, fontSize = 16.sp)
                        Text(text = "Learn to design communication networks.", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "3 semesters", color = Color.White, fontSize = 12.sp)
                        }
                    }
                }
            }

            // CURSO 3 - ELE
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)) // Borda amarela
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ele),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = "ELE", fontSize = 75.sp, color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Eletroeletrônica", color = Color.White, fontSize = 16.sp)
                        Text(text = "Learn to design communication networks.", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "3 semesters", color = Color.White, fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaSecondPreview() {
    TelaSecond()
}
