package com.bayviewglen.hangman;

import java.util.Scanner;

public class hangmanAssignment {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		//All variables
	
		final int playerOne = 1;
		final int playerTwo = 0;
		final int charStart = 0;
		final int turn = 2;
		final int player = 2;
		final int guess1 = 7;
		final int over = 0;
		final int rounds1 = 5;
		final int indexNeeded = -1;
		final int space = 25;
		final int CharOverOne = 1;
		final int points = 8;
		final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final String charactersNoSpace = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String guesses = " ";
		String currentplayer = " ";
		String cover = " ";
		String message = " ";
		String opponent = " ";
		String guess = " ";
		int playerOnePoints = 0;
		int playerTwoPoints = 0;
		int rounds = 1;
		int turns = 1;
		int guessed;
//Names of the players
		System.out.print("Hello player 1, please enter your name: ");
		String player1 = keyboard.nextLine().trim();

		System.out.print("Player 2, please enter your name: ");
		String player2 = keyboard.nextLine().trim();
		
		boolean gameOver = false;
		while (!gameOver) {
//players role
			if (turns % player == playerOne) {
				currentplayer = player1;
				opponent = player2;
			} else if (turns % player == playerTwo) {
				currentplayer = player2;
				opponent = player1;
			}
			System.out.println("------------------+*Round " + rounds + "*+----------------- ");
			guesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			guessed = 0;
			cover = "";
			
			System.out.print(opponent + ", please enter a phrase to be guessed by your oponent ");
//check to see if only alphanumeric character are being used
			boolean crossed = true;
			while (crossed) {
				message = keyboard.nextLine().toUpperCase().trim();
				crossed = false;
				if (message.length() == 0) {
					System.out.print(opponent + ", please enter a phrase to be guessed by your oponent ");
					crossed = true;
				}
				for (int i = 0; i < message.length(); i++) {
					if (characters.indexOf(message.charAt(i)) == indexNeeded) {
						System.out.print(opponent + ", please enter an alphanumerical phrase to be guessed: ");
						crossed = true;
						break;
					}
				}
			}
			//space between code
			for (int i = 0; i < space; i++)
				System.out.println();
			//hiding the message
			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) == ' ')
					cover += "/";
				else
					cover += "_";
			}
//print the coded message w/ spaces between the characters
			for (int i = 0; i < cover.length(); i++) {
				System.out.print(cover.charAt(i) + " ");
			}
			System.out.println();

			boolean round = true;
			while (guessed < guess1 && round) {
//asking user to guess the phrase or a letter
				System.out.print(currentplayer + ", you have used " + guessed
						+ " guesses, would you like to (1) solve the phrase or (2) guess a character: ");
				String UserInput = keyboard.nextLine();
				while (!(UserInput.equals("1") || UserInput.equals("2"))) {
					System.out.print(currentplayer + ", you must (1) solve the word/phrase or (2) guess a character! ");
					UserInput = keyboard.nextLine();
				}
//user wants to guess the WHOLE phrase
				if (UserInput.equals("1")) {
					System.out.print(currentplayer + ", please enter your answer: ");
//alphanumerical?
					crossed = true;
					while (crossed) {
						guess = keyboard.nextLine().toUpperCase().trim();
						crossed = false;
						for (int i = 0; i < guess.length(); i++) {
							if (characters.indexOf(guess.charAt(i)) == indexNeeded) {
								System.out.print(currentplayer + ", please enter an alphanumerical answer: ");
								crossed = true;
								break;
							}
						}
					}
//check if the answer is right
					if (guess.equals(message)) {
						System.out.println(currentplayer + ", you are right!");
						round = false;
						guessed--;
					} else {
						System.out.println(currentplayer + ", you are wrong!");
					}
//Player wants to guess a character
				} else if (UserInput.equals("2")) {
					System.out.print("Unused Characters: ");
					for (int i = 0; i < guesses.length(); i++) {
						System.out.print(guesses.charAt(i) + " ");

					}
					System.out.print(currentplayer + ", please guess a single character: ");
//check to see if the character is alphanumeric, and has a length of 1
//check if the character has been used
					crossed = true;
					while (crossed) {
						guess = keyboard.nextLine().toUpperCase().trim();
						if (charactersNoSpace.indexOf(guess) == indexNeeded) {
							System.out.print(currentplayer
									+ ", please guess a single character *please do not put any spaces, just a alphanumerical character*: ");
						} else if (guess.length() > 1 || guess.length() < 1) {
							System.out.print(currentplayer + ", please guess a single letter ");
						} else if (guesses.indexOf(guess) == indexNeeded) {
							System.out.print(currentplayer + ", please guess a letter that you have not guessed yet! ");
						} else {
							crossed = false;
							guesses = guesses.substring(charStart, guess.indexOf(guess)) + "_"
									+ guesses.substring(guess.indexOf(guess) + CharOverOne);

						}

					}
//check to see if the guessed character is in the phrase
					if (message.indexOf(guess) != indexNeeded) {
						System.out.println(currentplayer + ", congratulations, the letter '" + guess + "' is in the phrase! :)");
//show the correctly guessed characters
						for (int i = 0; i < cover.length(); i++) {
							if (message.substring(i, i + CharOverOne).equals(guess))
								cover = cover.substring(charStart, i) + guess + cover.substring(i + CharOverOne);
						}
					} else {
						System.out.println(currentplayer + ", the letter '" + guess + "' is not in the phrase! :(");
					}
//print out coded message
					for (int i = 0; i < cover.length(); i++) {
						System.out.print(cover.charAt(i) + " ");
					}

					System.out.println();
					if (cover.indexOf("_") == indexNeeded) {
						System.out.println("Congratulations, you won!");
						guessed--;
						round = false;
					}

				}
				guessed++;
			}
//player has ran out of guesses, they need to guess the phrase now
			if (guessed == guess1) {
				System.out.print(currentplayer + ", you have used all your guesses, please guess the entire phrase: ");
//Is the phrase valid?
				crossed = true;
				while (crossed) {
					guess = keyboard.nextLine().toUpperCase();

					crossed = false;
					for (int i = 0; i < guess.length(); i++) {
						if (characters.indexOf(message.charAt(i)) == indexNeeded) {
							System.out
									.print(currentplayer + ", please enter your answer using alphanumerical characters: ");
							guess = keyboard.nextLine().toUpperCase();
							crossed = true;
						}
					}
				}
//Is the guess right?
				if (guess.equals(message)) {
					System.out.println("CORRECT! :)");
				} else {
					System.out.println("WRONG! :(");
					guessed++;

				}
			}
//give points to the player who just played and add a round if needed
			if (turns % player == playerOne) {
				playerOnePoints += points - guessed;
			} else if (turns % player == playerTwo) {
				playerTwoPoints += points - guessed;
				rounds++;

			}
//printout total points for each player
			System.out.println("Total points: ");
			System.out.println(player1 + ": " + playerOnePoints);
			System.out.println(player2 + ": " + playerTwoPoints);
//Who wins and if they need a tie breaker
			if (turns % turn == over && rounds > rounds1) {
				if (playerOnePoints > playerTwoPoints) {
					System.out.println("Nice, " + player1 + ", you won!");
					gameOver = true;
				} else if (playerOnePoints < playerTwoPoints) {
					System.out.println("Nice, " + player2 + ", you won!");
					gameOver = true;
				} else {
					System.out.println("Looks like the game is a tie! You shall play another round, winner takes all!");
				}
			}

			turns++;

		}
		keyboard.close();

	}

}
