package models

// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.PostgresDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema = Entry.schema ++ Posts.schema ++ Users.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Entry
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param body Database column body SqlType(text), Default(None)
   *  @param head Database column head SqlType(text), Default(None)
   *  @param postId Database column post_id SqlType(int4), Default(None) */
  case class EntryRow(id: Int, body: Option[String] = None, head: Option[String] = None, postId: Option[Int] = None)
  /** GetResult implicit for fetching EntryRow objects using plain SQL queries */
  implicit def GetResultEntryRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[EntryRow] = GR{
    prs => import prs._
    EntryRow.tupled((<<[Int], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table entry. Objects of this class serve as prototypes for rows in queries. */
  class Entry(_tableTag: Tag) extends Table[EntryRow](_tableTag, "entry") {
    def * = (id, body, head, postId) <> (EntryRow.tupled, EntryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), body, head, postId).shaped.<>({r=>import r._; _1.map(_=> EntryRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column body SqlType(text), Default(None) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Default(None))
    /** Database column head SqlType(text), Default(None) */
    val head: Rep[Option[String]] = column[Option[String]]("head", O.Default(None))
    /** Database column post_id SqlType(int4), Default(None) */
    val postId: Rep[Option[Int]] = column[Option[Int]]("post_id", O.Default(None))

    /** Foreign key referencing Posts (database name entry_posts__fk) */
    lazy val postsFk = foreignKey("entry_posts__fk", postId, Posts)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Entry */
  lazy val Entry = new TableQuery(tag => new Entry(tag))

  /** Entity class storing rows of table Posts
   *  @param id Database column id SqlType(serial), AutoInc, PrimaryKey
   *  @param date Database column date SqlType(date), Default(None)
   *  @param `type` Database column type SqlType(varchar), Length(100,true)
   *  @param title Database column title SqlType(varchar), Length(100,true)
   *  @param tags Database column tags SqlType(_varchar), Length(100,false), Default(None)
   *  @param views Database column views SqlType(int4), Default(Some(0))
   *  @param lastUpdated Database column last_updated SqlType(date), Default(None) */
  case class PostsRow(id: Int, date: Option[java.sql.Date] = None, `type`: String, title: String, tags: Option[String] = None, views: Option[Int] = Some(0), lastUpdated: Option[java.sql.Date] = None)
  /** GetResult implicit for fetching PostsRow objects using plain SQL queries */
  implicit def GetResultPostsRow(implicit e0: GR[Int], e1: GR[Option[java.sql.Date]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[PostsRow] = GR{
    prs => import prs._
    PostsRow.tupled((<<[Int], <<?[java.sql.Date], <<[String], <<[String], <<?[String], <<?[Int], <<?[java.sql.Date]))
  }
  /** Table description of table posts. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Posts(_tableTag: Tag) extends Table[PostsRow](_tableTag, "posts") {
    def * = (id, date, `type`, title, tags, views, lastUpdated) <> (PostsRow.tupled, PostsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), date, Rep.Some(`type`), Rep.Some(title), tags, views, lastUpdated).shaped.<>({r=>import r._; _1.map(_=> PostsRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(serial), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column date SqlType(date), Default(None) */
    val date: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("date", O.Default(None))
    /** Database column type SqlType(varchar), Length(100,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(100,varying=true))
    /** Database column title SqlType(varchar), Length(100,true) */
    val title: Rep[String] = column[String]("title", O.Length(100,varying=true))
    /** Database column tags SqlType(_varchar), Length(100,false), Default(None) */
    val tags: Rep[Option[String]] = column[Option[String]]("tags", O.Length(100,varying=false), O.Default(None))
    /** Database column views SqlType(int4), Default(Some(0)) */
    val views: Rep[Option[Int]] = column[Option[Int]]("views", O.Default(Some(0)))
    /** Database column last_updated SqlType(date), Default(None) */
    val lastUpdated: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("last_updated", O.Default(None))
  }
  /** Collection-like TableQuery object for table Posts */
  lazy val Posts = new TableQuery(tag => new Posts(tag))

  /** Entity class storing rows of table Users
   *  @param personid Database column personid SqlType(int4), Default(None)
   *  @param lastname Database column lastname SqlType(varchar), Length(255,true), Default(None)
   *  @param firstname Database column firstname SqlType(varchar), Length(255,true), Default(None)
   *  @param address Database column address SqlType(varchar), Length(255,true), Default(None)
   *  @param city Database column city SqlType(varchar), Length(255,true), Default(None) */
  case class UsersRow(personid: Option[Int] = None, lastname: Option[String] = None, firstname: Option[String] = None, address: Option[String] = None, city: Option[String] = None)
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]]): GR[UsersRow] = GR{
    prs => import prs._
    UsersRow.tupled((<<?[Int], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends Table[UsersRow](_tableTag, "users") {
    def * = (personid, lastname, firstname, address, city) <> (UsersRow.tupled, UsersRow.unapply)

    /** Database column personid SqlType(int4), Default(None) */
    val personid: Rep[Option[Int]] = column[Option[Int]]("personid", O.Default(None))
    /** Database column lastname SqlType(varchar), Length(255,true), Default(None) */
    val lastname: Rep[Option[String]] = column[Option[String]]("lastname", O.Length(255,varying=true), O.Default(None))
    /** Database column firstname SqlType(varchar), Length(255,true), Default(None) */
    val firstname: Rep[Option[String]] = column[Option[String]]("firstname", O.Length(255,varying=true), O.Default(None))
    /** Database column address SqlType(varchar), Length(255,true), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(255,varying=true), O.Default(None))
    /** Database column city SqlType(varchar), Length(255,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
}
