package com.example.musicwhisky1.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun TelaCadastro(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Tela de Cadastro", modifier = Modifier.align(Alignment.CenterHorizontally))

        Button(
            onClick = {
                navController.navigate("home")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Voltar para Tela Inicial")
        }
    }
}

@Composable
fun PreviewTelaCadastro(){
    TelaCadastro(navController = rememberNavController())
}
