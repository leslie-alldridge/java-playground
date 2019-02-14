// Define a book and save a book to the database
const bookObject = {
  id: 1,
  title: "CRUD is awesome",
  author: "Leslie",
  category: "Web Development"
};

function saveBook(bookObject) {
  return db("books").insert(bookObject);
}

// Return all books from the database

function getBooks() {
  return db("books").select(); //select is optional but I prefer to include it
}

// Return a particular book from the database

function getBook(id) {
  return db("books")
    .where("id", id)
    .first();
}

// Update existing book in the database

function updateBook(id) {
  return db("books")
    .where("id", id)
    .update({ title: "This is a new title" });
}

// Delete book from the database

function deleteBook(id) {
  return db("books")
    .where("id", id)
    .del();
}
