package pe.edu.navigationjpc.ui.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment =
        Alignment.Center) {
        Text(text = "Home Screen", style =
            MaterialTheme.typography.headlineMedium)
    }
}
@Composable
fun HomeScreen(navController: NavController) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Pantalla de inicio", modifier = Modifier.padding(16.dp))
        Button (onClick = { navController.navigate("bottom_sheet_example") }) {
            Text("Ir al Bottom Sheet")
        }
    }
}