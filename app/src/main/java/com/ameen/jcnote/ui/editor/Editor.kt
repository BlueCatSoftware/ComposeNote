package com.ameen.jcnote.ui.editor

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Editor (navController: NavController?){
     Scaffold(
         topBar = {
             TopAppBar(
                 backgroundColor = MaterialTheme.colorScheme.surface,
                 elevation = 0.dp,

             ) {
                 ToolBarContent(navController)
             }
         },
     ) {
         NoteEditor()
     }
 }

@Composable
fun ToolBarContent(navController: NavController?) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp, vertical = 0.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            Icons.Rounded.ArrowBack, "Back",
            modifier = Modifier
                .padding(8.dp)
                .fillMaxHeight()
                .clickable {
                navController?.navigate("home")
            }
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            Icons.Rounded.PushPin, "Pin",
            modifier = Modifier
                .padding(8.dp)
                .fillMaxHeight()
        )
        Icon(
            Icons.Rounded.Check, "Save",
            modifier = Modifier
                .padding(8.dp)
                .fillMaxHeight()
                .clickable {
                    navController?.navigate("home")
                }
        )
    }
}

@Preview
@Composable
fun EditorDefaultPreview(){
    Editor(null)
}

